package com.ssm.ssmcrud.controller;

import java.util.List;

import com.ssm.ssmcrud.pojo.Books;
import com.ssm.ssmcrud.service.impl.BooksServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author:aaa
 */
@Controller
@RequestMapping("/book")
public class BookController {
    
    @Autowired
    private BooksServiceImpl bookser;


    @RequestMapping("/allbook")
    public String list(Model model) {
        List<Books> findAllBook = bookser.findAllBook();
        model.addAttribute("list", findAllBook);
        return "jsp/allBook";
    }


}
