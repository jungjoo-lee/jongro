package com.ohgiraffers.section.literal;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {
        /* 목차3 문자열 합치기 응용 */
        /* 10과 20의 사칙연산 결과를 출력하세요 */
        System.out.println("==============10과 20의 사칙연산 결과==============");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("==============10과 20의 사칙연산 결과를 보기 좋게 출력==============");
        System.out.println("10과 20의 합 : " + (10 + 20)); // 괄호를 묶지않으면 운자열 합치기가 되어서 결과가 1020이 된다.
        System.out.println("10과 20의 차 : " + (10 - 20)); // 문자열은 마이너스 연산이 불가능하기에 문자열과 마이너스는 연산이 불가능하다.(반드시 괄호사용)
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 몫 : " + (10 / 20));
        System.out.println("10과 20의 나머지 : " + (10 % 20));

        System.out.println("기차"); // 기차
        System.out.println("기차" + "칙칙폭폭"); // 기차칙칙폭폭
        System.out.println("기차" + 123 + 45 + "칙칙폭폭"); // 기차12345칙칙폭폭
        System.out.println(123 + 45 + "기차" + "출발"); // 168기차출발
    }
}
