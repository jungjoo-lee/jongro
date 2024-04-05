package com.example.ex2;

import java.util.Scanner;

public class Ex2 {
    public void InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한 개를 입력하세요 : ");

        int num = sc.nextInt();
        TestMethod(num);
    }

    public void TestMethod(int num) {
        if (num % 3 == 0) {
            System.out.println("입력하신 정수는 3의 배수입니다.");
        } else {
            System.out.println("입력하신 정수는 3의 배수가 아닙니다.");
        }
    }
}
