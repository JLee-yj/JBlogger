package com.lee.blog.command;

import com.alibaba.cola.dto.Response;
import com.lee.blog.convertor.UserProfileConvertor;
import com.lee.blog.domain.user.UserProfile;
import com.lee.blog.dto.UserProfileUpdateCmd;
import com.lee.blog.domain.gateway.UserProfileGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserProfileUpdateCmdExe{

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileUpdateCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.update(userProfile);
        return Response.buildSuccess();
    }
}