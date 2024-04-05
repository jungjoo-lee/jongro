package com.ohgiraffers.section05.parameter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RectAngle {
    private double width;
    private double height;

    public void calcArea() {
        System.out.println("이 사각형의 넓이는 " + width * height + "입니다.");
    }

    public void calcRound() {
        System.out.println("이 사각형의 둘레는 " + (width + height) * 2 + "입니다.");
    }
}
