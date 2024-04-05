package com.example.ex14;

import java.util.Scanner;

public class Ex14 {
    public void InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 가위 2. 바위 3. 보");
        System.out.print("입력 : ");
        int num = sc.nextInt();

        System.out.println();
        TestMethod(num);
    }

    public void TestMethod(int num) {
        int computerNum = (int) (Math.random() * 3) + 1;
        String[] gbb = new String[]{"", "가위", "바위", "보"};

        if (num > 3 || num < 1) {
            System.out.println("잘못 입력했습니다.");
            return;
        }

        System.out.println("You : " + gbb[num]);
        System.out.println("Computer : " + gbb[computerNum]);

        switch (computerNum) {
            case 1: {
                if (num == 1) {
                    System.out.println("비겼습니다.");
                } else if (num == 2) {
                    System.out.println("이겼습니다.");
                } else {
                    System.out.println("졌습니다.");
                }
                break;
            }
            case 2: {
                if (num == 1) {
                    System.out.println("졌습니다.");
                } else if (num == 2) {
                    System.out.println("비겼습니다.");
                } else {
                    System.out.println("이겼습니다.");
                }
                break;
            }
            case 3: {
                if (num == 1) {
                    System.out.println("이겼습니다.");
                } else if (num == 2) {
                    System.out.println("졌습니다.");
                } else {
                    System.out.println("비겼습니다.");
                }
                break;
            }
        }
    }
}
