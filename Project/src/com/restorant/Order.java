package com.restorant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<Dishes> orders = new ArrayList<>();

    public void addToOrder(String value) {
        Dishes dishes = Dishes.findByString(value);

        if (dishes != null) {
            System.out.println(dishes + " " + "add to order");
            orders.add(dishes);
            dishes.setDeleted(true);
            return;
        }
        System.out.println("dishes not on menu");
    }

    public void calculateOrder() {
        int totalSum = 0;
        Sale sale = new Sale();
        for (Dishes dish : orders) {
            totalSum += dish.getValue();
        }
        System.out.println("Total sum - " + (totalSum - sale.sale()));
    }

    public void printOrder() {
        for (Dishes dish : orders) {
            System.out.println(dish);
        }
    }

    public void printDishes() {
        for (Dishes dish : Dishes.values()) {
            if (!dish.isDeleted()) {
                System.out.println(dish);
            }
        }
    }

}
