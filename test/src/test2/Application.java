package test2;

import test1.TestMethod;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        TestMethod tm = new TestMethod();

        tm.Calculator(2, 5);

        double circleArea = tm.CircleArea();
        System.out.println("원의 넓이는 " + circleArea + "입니다.");

        String randomStr = TestMethod.TestRandom();
        System.out.println(randomStr);
    }
}
