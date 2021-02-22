package com.ssm.ssmcrud;


import com.ssm.ssmcrud.service.impl.BooksServiceImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SsmCrudApplicationTests {

    // @Autowired
    // private BookMapper bookmapper;

    @Autowired
    private BooksServiceImpl books;

    @Test
    void contextLoads() {
    }

    @Test
    public void add() {
        // BookService book = new BooksServiceImpl();
        System.out.println(books.findBook(1));
    }

    @Test
    public void test(int integer,int number) {
        int a = 0;
        int b = (int)Math.sqrt(integer);
        int c = number / 2;
        double x;
        for(;b <= c;b++){
            x = Math.sqrt(b*b + number);
            if((int)x == x){
                a = (int)(x*x - 100 - 168);
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}