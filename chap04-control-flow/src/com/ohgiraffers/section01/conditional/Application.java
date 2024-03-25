package com.ohgiraffers.section01.conditional;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        A_if a = new A_if();
//        a.testSimpleIfStatement();

        /* 중첩 if문 흐름 확인용 메소드 출력 */
//        a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
//        b.simpleIfElseStatement();
//        b.testNestedIfElseStatement();
        C_ifElseIf c = new C_ifElseIf();
//        c.testNestedIfElseIfStatement();
        D_switch d = new D_switch();
//        d.testSimpleSwitchStatement();
        d.testSwitchVendingMachine();
    }
}
