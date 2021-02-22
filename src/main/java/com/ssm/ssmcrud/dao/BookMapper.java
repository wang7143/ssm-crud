package com.ssm.ssmcrud.dao;

import java.util.List;



import com.ssm.ssmcrud.pojo.Books;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookMapper {
    
    int addBook(Books book);

    int deleteBook(int id);

    int updateBook(Books book);

    Books findBook(@Param("id")int id);

    List<Books> findAllBook();
}
