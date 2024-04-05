package com.example.ex25;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);
        Item item3 = new Item("배추", 1500, 2);
        Item item4 = new Item("고추", 2500, 7);
        Item item5 = new Item("양파", 3500, 6);
        Item item6 = new Item("대파", 2000, 5);
        Item item7 = new Item("쪽파", 1000, 1);
        Item item8 = new Item("가지", 1000, 4);
        Item item9 = new Item("당근", 1500, 3);
        Item item10 = new Item("오이", 2500, 2);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.addItem(item6);
        cart.addItem(item7);
        cart.addItem(item8);
        cart.addItem(item9);
        cart.addItem(item10);
        cart.addItem(item2);

        cart.displayItems();
    }
}
