package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 매개변수에 활용할 수 있다. */
        /* 1. 하단에 feed() 메소드 작성 */

        Application3 app3 = new Application3();
        app3.feed(new Rabbit());
        app3.feed(new Tiger());
    }

    public void feed(Animal animal) {
        animal.eat();
    }
}
