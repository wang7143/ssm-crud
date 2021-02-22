package com.ssm.ssmcrud.controller;

import com.ssm.ssmcrud.pojo.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author:123
 */
@RestController
public class PetContriller {
    
    @Autowired
    Person person;
    
    @RequestMapping("/person")
    public Person get() {
        
        return person;
    }
}
