package test1;

import java.util.Scanner;

public class TestMethod {
    static final double PI = 3.14;

    public void Calculator(int x, int y) {
        System.out.println("x + y = " + x + y);
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + x * y);
        System.out.println("x / y = " + x / y);
        System.out.println("x % y = " + x % y);
    }

    public double CircleArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("반지름 입력 : ");
        double r = sc.nextDouble();

        return r * r * PI;
    }

    public static String TestRandom() {
        int randomNumber = (int) (Math.random() * 10) + 1;
        String str = "생성된 난수는 " + randomNumber + "입니다.";

        return str;
    }
}
