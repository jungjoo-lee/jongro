package com.example.ex23;

public class Book {
    private String title = "";
    private String author = "";
    int page = 0;

    public Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo() {
        System.out.println("제목 : " + this.title + ", 저자 : " + this.author + ", 페이지 : " + this.page);
    }
}
