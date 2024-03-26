package com.ohgiraffers.section01.array;

public class Application3 {
    public static void main(String[] args) {
        /* 배열이 초기화 되는 자료형별 기본값을 이해할 수 있다. */

        /*
         * 값의 형태별 기본값
         * 정수 : 0
         * 실수 : 0.0
         * 논리 : false
         * 문자 : \u0000
         * 참조 : null
         */

        int[] iarr = new int[5];

        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[" + i + "]의 값 : " + iarr[i]);
        }

        /* 자바에서 지정한 기본값 외의 값을 초기화하고 싶은 경우 블럭을 이용한다.
         * 블럭을 이용하는 경우에는 new를 사용하지 않아도 되며 값의 갯수만큼 자동으로 크기가 설정된다.
         * */

        
    }
}
