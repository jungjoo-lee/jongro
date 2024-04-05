package com.example.ex9;

public class Ex9 {
    public void TestMethod() {
        int num1 = (int)(Math.random() * 6) + 1;
        int num2 = (int)(Math.random() * 6) + 1;
        int sum = 0;

        while (true) {
            num1 = (int)(Math.random() * 6) + 1;
            num2 = (int)(Math.random() * 6) + 1;
            sum = num1 + num2;

            System.out.println("(" + num1 + ", " + num2 + ")");

            if (sum == 5)
                break;
        }
    }
}
