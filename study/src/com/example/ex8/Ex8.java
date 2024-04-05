package com.example.ex8;

public class Ex8 {
    public void TestMethod() {
        int sum = 0;

        for (int i = 1; i < 101; i++) {
            if(i % 3 == 0)
                sum += i;
        }

        System.out.println("1에서 100까지에서 3의 배수 총합 : " + sum);
    }
}
