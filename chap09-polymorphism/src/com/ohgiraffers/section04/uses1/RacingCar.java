package com.ohgiraffers.section04.uses1;

public class RacingCar extends Car {
    @Override
    public void go() {
        System.out.println("레이싱차가 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱차가 멈춥니다.");
    }
}
