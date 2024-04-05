package com.example.ex12;

public class Ex12 {
    static int[] lottoArray = new int[46];
    static int[] winNumber = new int[6];

    public void TestMethod() {
        int count = 0;

        while (count != 6) {
            int num = (int)(Math.random() * 45) + 1;

            if (lottoArray[num] == 0) {
                lottoArray[num]++;
                winNumber[count++] = num;
            } else {
                continue;
            }
        }

        sort();
        Print();
    }

    public void sort() {
        int temp = 0;

        for (int i = 1; i < winNumber.length; i++) {
            for (int j = 0; j < winNumber.length; j++) {
                if (winNumber[i] < winNumber[j]) {
                    temp = winNumber[i];
                    winNumber[i] = winNumber[j];
                    winNumber[j] = temp;
                }
            }
        }
    }

    public void Print() {
        System.out.print("이번 로또 번호 : ");

        for (int j : winNumber) {
            System.out.print(j + " ");
        }
    }
}
