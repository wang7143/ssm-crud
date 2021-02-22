package com.ssm.ssmcrud.service.impl;

import java.util.List;


import com.ssm.ssmcrud.dao.BookMapper;
import com.ssm.ssmcrud.pojo.Books;
import com.ssm.ssmcrud.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksServiceImpl implements BookService{

    // @Resource
    @Autowired
    private BookMapper bookmapper;

    
    

    @Override
    public int addBook(Books book) {
        return bookmapper.addBook(book);
    }


    @Override
    public int deleteBook(int id) {
        return bookmapper.deleteBook(id);
    }


    @Override
    public int updateBook(Books book) {
        return bookmapper.updateBook(book);
    }


    @Override
    public Books findBook(int id) {
        return bookmapper.findBook(id);
    }


    @Override
    public List<Books> findAllBook() {
        return bookmapper.findAllBook();
    }


    public BookMapper getBookmapper() {
        return bookmapper;
    }


    public void setBookmapper(BookMapper bookmapper) {
        this.bookmapper = bookmapper;
    }

    


    

    


    

    
    
}
