package com.ohgiraffers.section04.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Application5 {
    public static void main(String[] args) {
        /*  */
        int[] iarr = {2, 5, 4, 6, 1, 3, 9, 7, 8};
        int temp;
        int j = 0;

        for (int i = 1; i < iarr.length; i++) {
            temp = iarr[i];
            for (j = i - 1; j >= 0 && temp < iarr[j]; j--) {
                iarr[j + 1] = iarr[j];
            }
            iarr[j + 1] = temp;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }
}
