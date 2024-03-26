package com.ohgiraffers.section01.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        /* 수업목표 배열을 사용하는 예시를 이해하고 적용할 수 있다. */
        /* 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만들어보세요. */

        int[] pointArr = new int[5];
        int sum = 0;
        double avg = 0.0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < pointArr.length; i++) {
            System.out.print((i + 1) + "번 사람의 점수 입력 : ");

            pointArr[i] = sc.nextInt();
            sum += pointArr[i];
        }

        avg = (double) sum / pointArr.length;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
