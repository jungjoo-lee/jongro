package com.ohgiraffers.section01.method;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Application7 {
    public static void main(String[] args) throws IOException {
        /* 수업목표 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다. */
        /*
         * 매개변수와 리턴값 복합활용
         * 매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하며 간단한 계산기 만들기
         */

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Application7 app = new Application7();
        int first = 10;
        int second = 20;
        System.out.println("더하기 : " + app.plusTwoNum(first, second));
        System.out.println("빼기 : " + app.minusTwoNum(first, second));
        System.out.println("곱하기 : " + app.mulTwoNum(first, second));
        System.out.println("나누기 : " + app.divTwoNum(first, second));
        System.out.println("나머지 : " + app.modTwoNum(first, second));

        bw.write("더하기 : " + app.plusTwoNum(first, second) + "\n");
        bw.write("빼기 : " + app.minusTwoNum(first, second) + "\n");
        bw.write("곱하기 : " + app.mulTwoNum(first, second) + "\n");
        bw.write("나누기 : " + app.divTwoNum(first, second) + "\n");
        bw.write("나머지 : " + app.modTwoNum(first, second) + "\n");
        bw.flush();
    }

    public int plusTwoNum(int first, int second) {
        return first + second;
    }

    public int minusTwoNum(int first, int second) {
        return first - second;
    }

    public int mulTwoNum(int first, int second) {
        return first * second;
    }

    public int divTwoNum(int first, int second) {
        return first / second;
    }

    public int modTwoNum(int first, int second) {
        return first % second;
    }
}
