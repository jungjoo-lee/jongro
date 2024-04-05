package com.ohgiraffers.section01.list.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private int num;
    private String title;
    private String author;
    private int price;
}
