package com.ohgiraffers.section01.conditional;

import java.io.*;
import java.util.Scanner;

public class B_ifElse {
    public void simpleIfElseStatement() throws IOException {
        /*
         * [if-else 표현식]
         * if(조건식) {
         *      조건식이 true일 때 실행할 명령문;
         * } else {
         *      조건식이 false일 때 실행할 명령문;
         * }
         */

        /* if문은 조건식의 결과가 참이면 if{}안에 있는 코드를 실행하고
         * 조건식의 결과가 거짓이면 else {} 안에 있는 코드를 실행한다.
         * */

        /* 정수 한 개를 입력받아 그 수가 홀수이면 "입력하신 숫자는 홀수입니다"를 출력하고
         * 홀수가 아니면 "입력하신 숫자는 짝수입니다"를 출력하는 프로그램을 작성해보자
         * 단, 조건과 상관없이 프로그램이 종료할 때 "프로그램을 종료합니다"라고 출력되도록 한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.print("숫자 한 개를 입력하세요 : ");
        int num = br.read();
        int result = num % 2;

        switch (result) {
            case 1 -> bw.write("입력하신 숫자는 홀수입니다.\n");
            case 0 -> bw.write("입력하신 숫자는 짝수입니다.\n");
        }
        bw.write("프로그램을 종료합니다.\n");
        bw.flush();
    }

    public void testNestedIfElseStatement() {
        /* 수업목표 중첩된 if-else 문의 흐름을 이해하고 적용할 수 있다. */
        /* 중첩된 if-esle문 실행 흐름 확인 */

        /*
         * 숫자 하나를 입력받아 양수이면 "입력하신 숫자는 양수입니다"를 출력하고
         * 음수이면 "입력하신 숫자는 음수입니다"를 출력
         * 단, 0이면 "0입니다"라고 출력하세요
         * 조건과 상관없이 프로그램이 종료할 때 "프로그램을 종료합니다"라고 출력되도록 한다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();

        if (num != 0) {
            if (num > 0) {
                System.out.println("입력하신 숫자는 양수입니다.");
            } else {
                System.out.println("입력하신 숫자는 음수입니다.");
            }
        } else {
            System.out.println("입력하신 숫자는 0입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
