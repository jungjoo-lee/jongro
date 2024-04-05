package com.example.ex3;

import java.util.Scanner;

public class Ex3 {
    public void InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학년 입력 : ");
        int grade = sc.nextInt();

        System.out.print("점수 입력 : ");
        int point = sc.nextInt();

        TestMethod(grade, point);
    }

    public void TestMethod(int grade, int point) {
        if (grade == 4) {
            if (point <= 100 && point >= 70) {
                System.out.println("합격입니다.");
            } else if(point < 70 && point >= 0) {
                System.out.println("불합격입니다.");
            } else {
                System.out.println("그런 점수는 없습니다.");
            }
        } else if(grade >= 1 && grade <= 3){
            if(point <= 100 && point >= 60) {
                System.out.println("합격입니다.");
            } else if(point < 60 && point >= 0) {
                System.out.println("불합격입니다.");
            } else {
                System.out.println("그런 점수는 없습니다.");
            }
        } else if (grade >= 5 && grade < 7) {
            System.out.println("시험 안침");
        } else {
            System.out.println("그런 학년은 없습니다.");
        }
    }
}
