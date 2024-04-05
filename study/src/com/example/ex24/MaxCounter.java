package com.example.ex24;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (this.max <= count) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            this.count++;
        }
    }

    public int getCount() {
        return this.count;
    }
}
