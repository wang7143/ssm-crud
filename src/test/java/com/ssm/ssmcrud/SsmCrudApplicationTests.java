package com.ssm.ssmcrud;

import com.ssm.ssmcrud.service.BookService;
import com.ssm.ssmcrud.service.impl.BooksServiceImpl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SsmCrudApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void add() {
        BookService book = new BooksServiceImpl();
        System.out.println(book.findBook(1));
    }

}
