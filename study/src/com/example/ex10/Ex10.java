package com.example.ex10;

public class Ex10 {
    public void TestMethod() {
        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
