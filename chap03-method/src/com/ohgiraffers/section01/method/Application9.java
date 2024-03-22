package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        /* 수업목표 다른 클래스에 작성한 메소드를 호출할 수 있다. */
        /* 다른 클래스에 작성한 메소드 호출 */

        /* 최대값 최솟값을 비교할 두 정수를 변수로 선언 */
        int first = 100;
        int second = 50;

        /* non-static 메소드의 경우 */
        /*
         * 클래스가 다르더라도 사용하는 방법은 동일하다.
         * 클래스명 사용할이름 = new 클래스명();
         * 사용할이름.메소드명();
         */
        Calculator cal = new Calculator();
        System.out.println("두 수의 최솟값 : " + cal.minNumber(first, second));

        /* static 메소드인 경우 */
        /* 다른 클래스에 작성한 static 메소드의 경우 호출할 때 클래스명을 반드시 기술해야한다.
         * 클래스명.메소드명();
         */
        System.out.println("두 수의 최댓값 : " + Calculator.maxNumber(first, second));

        /*
         * static 메소드는 non-static 메소드처럼 호출은 가능하지만
         * 권장하지 않는다
         * 이미 메모리에 로딩되어있는 static 메소드는 여러 객체가 공유하게 된다.
         * 그때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못하는 동작을 유발할 수 있기 때문에
         * 사용을 제한해 달라는 경고다. 시스템이 복잡할수록 유지보수에 악영향을 준다.
         */
    }
}