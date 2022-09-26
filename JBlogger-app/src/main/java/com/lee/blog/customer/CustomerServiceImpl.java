package com.lee.blog.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.lee.blog.api.CustomerServiceI;
import com.lee.blog.customer.executor.CustomerAddCmdExe;
import com.lee.blog.customer.executor.query.CustomerListByNameQryExe;
import com.lee.blog.dto.CustomerAddCmd;
import com.lee.blog.dto.CustomerListByNameQry;
import com.lee.blog.dto.data.CustomerDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}