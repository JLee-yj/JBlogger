package com.lee.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.lee.blog", "com.alibaba.cola" })
@MapperScan("com.lee.blog.gatewayimpl.database")
public class JBloggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JBloggerApplication.class, args);
    }

}
