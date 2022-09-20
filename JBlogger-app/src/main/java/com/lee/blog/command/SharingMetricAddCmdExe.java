package com.lee.blog.command;

import com.alibaba.cola.dto.Response;
import com.lee.blog.domain.metrics.techinfluence.InfluenceMetric;
import com.lee.blog.domain.metrics.techinfluence.SharingMetric;
import com.lee.blog.domain.metrics.techinfluence.SharingMetricItem;
import com.lee.blog.domain.metrics.techinfluence.SharingScope;
import com.lee.blog.domain.user.UserProfile;
import com.lee.blog.dto.SharingMetricAddCmd;
import com.lee.blog.domain.gateway.MetricGateway;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * SharingMetricAddCmdExe
 *
 * @author Frank Zhang
 * @date 2019-03-02 5:00 PM
 */
@Component
public class SharingMetricAddCmdExe{

    @Resource
    private MetricGateway metricGateway;

    public Response execute(SharingMetricAddCmd cmd) {
        SharingMetricItem sharingMetricItem = new SharingMetricItem();
        BeanUtils.copyProperties(cmd.getSharingMetricCO(), sharingMetricItem);
        sharingMetricItem.setSubMetric(new SharingMetric(new InfluenceMetric(new UserProfile(cmd.getSharingMetricCO().getOwnerId()))));
        sharingMetricItem.setSharingScope(SharingScope.valueOf(cmd.getSharingMetricCO().getSharingScope()));
        metricGateway.save(sharingMetricItem);
        return Response.buildSuccess();
    }
}
