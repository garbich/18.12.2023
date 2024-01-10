package com.restorant;

import javax.swing.plaf.IconUIResource;

public class Sale {
    public Order order = new Order();
    Sale() {
    }

    public int sale() {
        int totalSale = 0;
        System.out.println("123");
        for (Dishes dish : order.orders) {
            System.out.println("123");

            if (dish == Dishes.PASTA) {
                System.out.println("123");

                totalSale += 30;
            }

            if (dish == Dishes.WINE) {
                totalSale += 30;
            }

            if (dish == Dishes.SALAD) {
                totalSale += 10;
            }
            if (dish == Dishes.DESSERT) {
                totalSale += 15;
            }
            if (dish == Dishes.PIZZA) {
                totalSale += 30;
            }
            if (dish == Dishes.SPRITE) {
                totalSale += 33;
            }

        }

        System.out.println("Sale: " + totalSale);
        return totalSale;
    }


}
