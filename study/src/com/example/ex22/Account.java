package com.example.ex22;

public class Account {
    private int balance;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.balance < amount) {
            System.out.println("잔액 부족");
            System.out.println("잔고 : " + this.balance);
        } else {
            this.balance -= amount;
        }
    }
}
