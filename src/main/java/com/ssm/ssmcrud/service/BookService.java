package com.ssm.ssmcrud.service;

import java.util.List;

import com.ssm.ssmcrud.pojo.Books;

public interface BookService {
    int addBook(Books book);

    int deleteBook(int id);

    int updateBook(Books book);

    Books findBook(int id);

    List<Books> findAllBook();
}
