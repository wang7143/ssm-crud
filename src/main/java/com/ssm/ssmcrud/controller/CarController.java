package com.ssm.ssmcrud.controller;

import com.ssm.ssmcrud.pojo.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 132
 * @return
 */
@RestController
public class CarController {
    
    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car getCar() {
        return car;
    }
}










