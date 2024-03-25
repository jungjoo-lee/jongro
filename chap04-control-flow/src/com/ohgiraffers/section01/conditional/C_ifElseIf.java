package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    public void testSimpleIfElseIfStatement() {
        /* 수업목표 if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
         * [if-else-if문 표현식]
         * if(조건식1) {
         *      조건식1이 true일 때 실행할 명령문;
         * } else if(조건식2) {
         *      조건식2가 true일 때 실행할 명령문;
         * } else {
         *      위의 두 개의 조건이 모두가 거짓일 경우 실행할 명령문
         * }
         * */
    }

    public void testNestedIfElseIfStatement() {
        /*
         *  ohgiraffers 대학의 김xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        if (point >= 95)
            System.out.println("점수는 A+입니다.");
        else if(point >= 90)
            System.out.println("점수는 A입니다.");
        else if(point >= 85)
            System.out.println("점수는 B+입니다.");
        else if(point >= 80)
            System.out.println("점수는 B입니다.");
        else if(point >= 75)
            System.out.println("점수는 C+입니다.");
        else if(point >= 70)
            System.out.println("점수는 C입니다.");
        else if(point >= 65)
            System.out.println("점수는 D+입니다.");
        else if(point >= 60)
            System.out.println("점수는 D입니다.");
        else
            System.out.println("점수는 F입니다.");

        if (point >= 90) {
            if (point >= 95)
                System.out.println("점수는 A+입니다.");
            else
                System.out.println("점수는 A입니다.");
        } else if (point >= 80) {
            if (point >= 85)
                System.out.println("점수는 B+입니다.");
            else
                System.out.println("점수는 B입니다.");
        } else if (point >= 70) {
            if (point >= 75)
                System.out.println("점수는 C+입니다.");
            else
                System.out.println("점수는 C입니다.");
        } else if (point >= 60) {
            if (point >= 65)
                System.out.println("점수는 D+입니다.");
            else
                System.out.println("점수는 D입니다.");
        } else
            System.out.println("점수는 F입니다.");
    }
}
