package com.example.ex6;

public class Ex6 {
    public void TestMethod() {
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0 || i % 5 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
