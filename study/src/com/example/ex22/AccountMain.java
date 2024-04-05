package com.example.ex22;

public class AccountMain {
    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(10000);
        a.withdraw(9000);
        a.withdraw(2000);
    }
}
