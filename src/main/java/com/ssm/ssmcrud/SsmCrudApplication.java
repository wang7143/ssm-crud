package com.ssm.ssmcrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @MapperScan(value = "com.ssm.ssmcrud.dao")
public class SsmCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmCrudApplication.class, args);
    }

}
