package com.example.ex21;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] poArray = new ProductOrder[3];
        int sum = 0;

        ProductOrder po1 = new ProductOrder("두부", 2000, 2);
        ProductOrder po2 = new ProductOrder("김치", 5000, 1);
        ProductOrder po3 = new ProductOrder("콜라", 1500, 2);
        poArray[0] = po1;
        poArray[1] = po2;
        poArray[2] = po3;

        for (int i = 0; i < poArray.length; i++) {
            System.out.println(poArray[i].toString());
            sum += poArray[i].getPrice() * poArray[i].getQuantity();
        }
        System.out.println("총 결제 금액 : " + sum);
    }
}
