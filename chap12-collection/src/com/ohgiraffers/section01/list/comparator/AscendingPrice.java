package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getPrice() > o2.getPrice() ? 1 : o1.getPrice() == o2.getPrice() ? 0 : -1;
    }
}
