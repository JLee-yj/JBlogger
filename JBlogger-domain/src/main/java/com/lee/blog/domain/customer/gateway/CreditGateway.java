package com.lee.blog.domain.customer.gateway;


import com.lee.blog.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
