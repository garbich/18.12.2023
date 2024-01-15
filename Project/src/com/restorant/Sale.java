package com.restorant;

import javax.swing.plaf.IconUIResource;

public class Sale {
    private final static Order order = new Order();

    Sale() {
    }

    public int sale() {
        int totalSale = 0;
        totalSale += saleOnDrinks();
        totalSale += saleOnDessert();
        totalSale += saleWithMeat();

        System.out.println("Sale: " + totalSale);
        return totalSale;
    }

    private int saleOnDrinks(){
        int totalSale = 0;
        for (Dishes dish : Order.orders) {
            if (dish == Dishes.WATER) {
                totalSale += 5;
            }
            if (dish == Dishes.SPRITE) {
                totalSale += 15;
            }
            if (dish == Dishes.COKE) {
                totalSale += 15;
            }
            if (dish == Dishes.WINE) {
                totalSale += 20;
            }
        }

        return totalSale;
    }

    private int saleWithMeat(){
        int totalSale = 0;
        for (Dishes dish : Order.orders) {
            if (dish == Dishes.STEAK) {
                totalSale += 20;
            }
            if (dish == Dishes.BURGER) {
                totalSale += 10;
            }
            if (dish == Dishes.PIZZA) {
                totalSale += 18;
            }
            if (dish == Dishes.SANDWICH) {
                totalSale += 8;
            }
        }


        return totalSale;
    }

    private int saleOnDessert(){
        int totalSale = 0;
        for (Dishes dish : Order.orders) {
            if (dish == Dishes.CAKE) {
                totalSale += 10;
            }
            if (dish == Dishes.JELLY) {
                totalSale += 10;
            }
            if (dish == Dishes.TIRAMISU) {
                totalSale += 12;
            }
            if (dish == Dishes.ICECREAM) {
                totalSale += 15;
            }
        }

        return totalSale;
    }

}
