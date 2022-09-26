package com.lee.blog.customer.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import java.util.ArrayList;
import java.util.List;

import com.lee.blog.dto.CustomerListByNameQry;
import com.lee.blog.dto.data.CustomerDTO;
import org.springframework.stereotype.Component;


@Component
public class CustomerListByNameQryExe{
    public MultiResponse<CustomerDTO> execute(CustomerListByNameQry cmd) {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomerName("Frank");
        customerDTOList.add(customerDTO);
        return MultiResponse.of(customerDTOList,customerDTOList.size());
    }
}
