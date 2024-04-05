package com.ohgiraffers.section03.interfaceimplements;

import java.io.Serializable;

public interface InterProduct extends Serializable {
    /*
     * 인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 사용하며
     * 이때는 여러 인터페이스를 다중 상속 받을 수 있다.
     * */
    public static final int MAX_NUM = 100;

    /* 상수필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final 이다 */
    int MIN_NUM = 10;

    /* 인터페이스는 생성자를 가질 수 없다. */
    void absMethod();

    /* 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다. */
    void nonStaticMethod();

    /* 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다(다른 접근제한자 사용불가)
     * 따라서 인터페이스 메소드를 오버라이딩 하는 경우
     * 반드시 접근제한자를 public 으로 해야 오버라이딩이 가능하다.
     * */

    /* 하지만, static 메소드는 작성이 가능하다. (JDK 1.8에 추가된 기능) */
    static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출됨...");
    }

    /* default 키워드를 사용하면 non-static 메소드도 작성 가능하다.(JDK 1.8에 추가된 기능) */
    default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨...");
    }
}
