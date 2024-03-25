package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoToNice() {
        /* 수업목표 중첩된 for문의 흐름을 이해하고 적용할 수 있다 */
        /* for문안에 for문을 이용할 수 있다 */

        Scanner sc = new Scanner(System.in);

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    public void printStarInputRowTimes() {
        /* 키보드로 정수 하나를 입력받아 해당 정수만큼 한 행에 '*'을 5개씩 출력하세요 */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요 : ");

        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            printStar(5);
            System.out.println();
        }
    }

    public void printStar(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("*");
        }
    }

    public void printTriangleStars() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
