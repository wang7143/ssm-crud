package com.ssm.ssmcrud;

import com.ssm.ssmcrud.conf.MyConfig;
import com.ssm.ssmcrud.pojo.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;
/**
 * @author:123
 */
@SpringBootApplication
@Slf4j
public class SsmCrudApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SsmCrudApplication.class, args);

        log.info("请求");
        User tom = run.getBean("tom",User.class);
        User tom1 = run.getBean("tom",User.class);

        System.out.println(tom == tom1);

        System.out.println(run.getBean(MyConfig.class));
    }
}


