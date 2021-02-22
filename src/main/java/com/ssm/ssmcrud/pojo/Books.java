package com.ssm.ssmcrud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:123
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int booID;
    private String bookName;
    private int bookCounts;
    private String detail;
}

