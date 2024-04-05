package com.example.ex5;

public class Ex5 {
    public void TestMethod() {
        System.out.println("=========== for 문 ===========");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            if (i == 9)
                break;
            System.out.println();
        }
        System.out.println("==============================");
        System.out.println();
        System.out.println("========== while 문 ==========");
        int i = 2;

        while (i < 10) {
            int j = 1;

            while(j < 10) {
                System.out.println(i + " * " + j + " = " + i * j++);
            }
            if(i == 9)
                break;
            System.out.println();
            i++;
        }
        System.out.println("==============================");
    }
}
