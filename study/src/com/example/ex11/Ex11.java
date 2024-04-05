package com.example.ex11;

import java.util.Scanner;

public class Ex11 {
    static final int MAX = 10;
    static String[] productNames = new String[MAX];
    static int[] productPrices = new int[MAX];
    static int productCount = 0;

    public void Print() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int select;

            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");

            select = sc.nextInt();

            switch (select) {
                case 1 -> productInsert();
                case 2 -> productList();
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
            }
        }
    }

    public void productInsert() {
        if (productCount >= MAX) {
            System.out.println("더 이상 상품을 등록할 수 없습니다.");
            System.out.println();
            return;
        }
        Scanner sc = new Scanner(System.in);

        System.out.print("상품 이름을 입력하세요 : ");
        productNames[productCount] = sc.nextLine();

        System.out.print("상품 가격을 입력하세요 : ");
        productPrices[productCount] = sc.nextInt();

        productCount++;

        System.out.println("상품이 등록 되었습니다.");
        System.out.println();
    }

    public void productList() {
        for(int i = 0; i < productCount; i++) {
            System.out.println(productNames[i] + " : " + productPrices[i] + "원");
        }
        System.out.println();
    }
}
