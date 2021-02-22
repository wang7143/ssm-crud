package com.ssm.ssmcrud.conf;


import com.ssm.ssmcrud.pojo.Car;
import com.ssm.ssmcrud.pojo.User;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:1111
 */
@Configuration
@EnableConfigurationProperties(Car.class)  
public class MyConfig {
    

    @Bean("tom")
    public User book() {
        return new User("zhangsan",18);  
    }
}