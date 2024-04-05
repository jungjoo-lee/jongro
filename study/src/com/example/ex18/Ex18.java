package com.example.ex18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex18 {
    static int money = 0;
    Scanner sc = new Scanner(System.in);

    public void Print() {
        while (true) {
            int select = 0;

            System.out.println("\n=================================================");
            System.out.println("1. 입금  |  2. 출금  |  3. 잔액 확인  |  4. 종료");
            System.out.println("=================================================");
            System.out.print("선택 : ");
            select = sc.nextInt();

            switch (select) {
                case 1 -> InputMoney();
                case 2 -> OutputMoney();
                case 3 -> CheckBalance();
                case 4 -> {
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;
                }
                default -> System.out.println("잘못 선택하셨습니다.");
            }
        }
    }

    public void InputMoney() {
        int inputMoney;

        System.out.println();
        System.out.print("입금액을 입력하세요 : ");
        inputMoney = sc.nextInt();

        money += inputMoney;

        System.out.println(inputMoney + "원을 입금하였습니다. 현재 잔액 : " + money);
    }

    public void OutputMoney() {
        int outputMoney;

        System.out.println();
        System.out.print("출금액을 입력하세요 : ");
        outputMoney = sc.nextInt();

        if (money < outputMoney) {
            System.out.println(outputMoney + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            money -= outputMoney;
            System.out.println(outputMoney + "원을 출금하였습니다. 현재 잔액 : " + money);
        }
    }

    public void CheckBalance() {
        System.out.println();
        System.out.println("현재 잔액 " + money + "원");
    }
}
