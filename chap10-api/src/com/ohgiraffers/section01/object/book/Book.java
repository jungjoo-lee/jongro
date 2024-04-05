package com.ohgiraffers.section01.object.book;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int num;
    private String title;
    private String author;
    private int price;
}
