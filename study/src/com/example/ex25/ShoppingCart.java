package com.example.ex25;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private static int itemCount = 0;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            System.out.println("그래서 " + item.getName() + " " + item.getQuantity() + "개를 버리겠습니다.");
            return;
        }
        items[itemCount++] = item;
    }

    public void displayItems() {
        int sum = 0;

        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                continue;
            } else {
                System.out.println(items[i].toString());
                sum += items[i].getPrice() * items[i].getQuantity();
            }
        }

        System.out.println("전체 가격 합 : " + sum);
    }
}
