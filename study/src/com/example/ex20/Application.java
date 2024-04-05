package com.example.ex20;

public class Application {
    public static void main(String[] args) {
        // 1.
        MovieReview mr1 = new MovieReview("인센션", "인생은 무한 루프");
        MovieReview mr2 = new MovieReview("어바웃 타임", "인생 시간 영화!");

        System.out.println(mr1.toString());
        System.out.println(mr2.toString());

        // 2.
        MovieReview[] mrArray = new MovieReview[2];
        MovieReview mr3 = new MovieReview("인센션", "인생은 무한 루프");
        MovieReview mr4 = new MovieReview("어바웃 타임", "인생 시간 영화!");
        mrArray[0] = mr3;
        mrArray[1] = mr4;

        for (int i = 0; i < mrArray.length; i++) {
            System.out.println(mrArray[i].toString());
        }
    }
}
