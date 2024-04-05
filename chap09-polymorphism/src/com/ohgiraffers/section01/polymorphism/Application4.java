package com.ohgiraffers.section01.polymorphism;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Application4 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 리턴타입을 활용할 수 있다. */
        /* 1. getRandomAnimal() 추가 */

        /* 2. getRandomAnimal() 호출 */
        Application4 app4 = new Application4();

        Animal ra = app4.getRandomAnimal();
        ra.cry();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Animal animal = new Animal(new Rabbit(5));
    }

    public Animal getRandomAnimal() {
        int random = (int) (Math.random() * 2);

        return random == 0 ? new Rabbit() : new Tiger();
    }
}
