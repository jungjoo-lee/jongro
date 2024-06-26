package com.ohgiraffers.section04.sort;

public class Application3 {
    public static void main(String[] args) {
        /* 선택정렬(select sort)에 대해 이해하고 적용할 수 있다. */
        /*
         * 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
         * 데이터 양이 적을 때 좋은 성능을 나타낸다(교환횟수가 적음)
         * 하지만 배열을 전부 탐색하여 최소값을 찾아야 하기 때문에 100개 이상의 자료에서는 급격하게
         * 속도가 저하된다.
         */
        int[] iarr = {2, 5, 4, 6, 1, 3, 9, 10, 7, 8};
        int min; // 최소값을 가진 데이터 인덱스 저장 변수
        int temp;

        for (int i = 0; i < iarr.length; i++) {
            min = i;
            for (int j = i + 1; j < iarr.length; j++) {
                if (iarr[min] > iarr[j]) {
                    min = j;
                }
            }
            temp = iarr[min];
            iarr[min] = iarr[i];
            iarr[i] = temp;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }
}
