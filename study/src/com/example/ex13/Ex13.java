package com.example.ex13;

import java.math.BigInteger;

public class Ex13 {
    public void Print() {
        System.out.println("100! = " + TestFactorial(100));
    }

    public static BigInteger TestFactorial(int num) {
        if (num == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(num).multiply(TestFactorial(num - 1));
        }
    }
}
