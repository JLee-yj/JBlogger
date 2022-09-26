package com.lee.blog.domain.customer.gateway;


import com.lee.blog.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
