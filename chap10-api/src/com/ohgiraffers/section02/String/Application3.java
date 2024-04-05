package com.ohgiraffers.section02.String;

import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {
        /* 문자열 분리에 대해 이해하고 적용할 수 있다. */
        /*
         * 문자열을 구분자로 하여 분리한 문자열을 반환하는 기능을 한다
         * split() : 정규표현식을 이용하여 문자열을 분리한다
         *           비정형화된 문자열을 분리할 때 좋지만(공백문자열 포함)
         *           정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다
         *           정규표현식은 자바스크립트에서 다룰 예정
         *
         * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다
         *                   정형화된 문자열 패턴을 분리할 때 사용하기 좋다(공백 문자열 무시)
         *                   split()보다 속면에서 더 빠르다
         *                   구분자를 생략하는 경우 공백이 구분자이다.
         * */
        String emp1 = "100/홍길동/서울/영업부"; // 모든값이 존재함
        String emp2 = "200/유관순//영업부"; // 주소없음
        String emp3 = "300/이순신/경기도/"; // 부서없음

        String[] empArray1 = emp1.split("/");
        String[] empArray2 = emp2.split("/");
        String[] empArray3 = emp3.split("/");

        for (int i = 0; i < empArray1.length; i++) {
            System.out.println("empArray1[" + i + "] = " + empArray1[i]);
        }
        System.out.println();

        for (int i = 0; i < empArray2.length; i++) {
            System.out.println("empArray2[" + i + "] = " + empArray2[i]);
        }
        System.out.println();

        for (int i = 0; i < empArray3.length; i++) {
            System.out.println("empArray3[" + i + "] = " + empArray3[i]);
        }
        System.out.println();

        String[] empArray4 = emp3.split("/", -1);
        for (int i = 0; i < empArray4.length; i++) {
            System.out.println("empArray4[" + i + "] = " + empArray4[i]);
        }

        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");


        System.out.print("st1 = ");
        while (st1.hasMoreTokens()) {
            System.out.print(st1.nextToken() + " ");
        }
        System.out.println();

        System.out.print("st2 = ");
        while (st2.hasMoreTokens()) {
            System.out.print(st2.nextToken() + " ");
        }
        System.out.println();

        System.out.print("st3 = ");
        while (st3.hasMoreTokens()) {
            System.out.print(st3.nextToken() + " ");
        }
        System.out.println();

        String colorStr = "red*orange#blue/yellow green";
        String[] color = colorStr.split("[*#/ ]");

        for (int i = 0; i < color.length; i++) {
            System.out.println("color[" + i + "] = " + color[i]);
        }

        StringTokenizer st4 = new StringTokenizer(colorStr, "*#/ ");

        System.out.print("st4 = ");
        while (st4.hasMoreTokens()) {
            System.out.print(st4.nextToken() + " ");
        }
    }
}
