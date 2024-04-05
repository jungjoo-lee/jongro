package com.example.ex1;

import java.util.Scanner;

public class Ex1 {
    public void InputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 한 개를 입력해주세요 : ");
        int num = sc.nextInt();

        TestMethod(num);
    }

    public void TestMethod(int num) {
        if(num >= 50)
            System.out.println("입력한 정수" + num + "는(은) 50 이상입니다.");
        else
            System.out.println("입력한 정수" + num + "는(은) 50 미만입니다.");
    }
}
