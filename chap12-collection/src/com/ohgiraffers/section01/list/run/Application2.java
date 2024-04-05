package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* ArrayList 정렬 기능을 이해할 수 있다. */
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 100000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 120050));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 3000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 3500));
        
        /* 제네릭 타입 제한에 의해 Comparable 타입을 가지고 있는 경우에만 sort 가능 */
        for (BookDTO book : bookList) {
            System.out.println(book.toString());
        }
        System.out.println("====================================");

        bookList.sort(new AscendingPrice());
        for (BookDTO book : bookList) {
            System.out.println(book.toString());
        }
        System.out.println("====================================");

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() > o2.getPrice() ? -1 : o1.getPrice() == o2.getPrice() ? 0 : 1;
            }
        });
        for (BookDTO book : bookList) {
            System.out.println(book.toString());
        }

        Comparator<Integer> comp = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comp.compare(1, 2));
    }
}
