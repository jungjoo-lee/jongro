package com.example.ex4;

import java.util.Scanner;

public class Ex4 {
    public void InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력해주세요 : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        TestMethod(num1, num2, num3);
    }

    public void TestMethod(int num1, int num2, int num3) {
        int min = 0, max = 0, sum;
        double avg;

        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
            }
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        if (num1 > num2) {
            if (num2 > num3) {
                min = num3;
            } else {
                min = num2;
            }
        } else if (num1 < num3) {
            min = num1;
        } else {
            min = num3;
        }

        sum = num1 + num2 + num3;
        avg = sum / 3.0;

        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
