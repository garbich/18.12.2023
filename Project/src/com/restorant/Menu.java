package com.restorant;

public class Menu {
    public void start() {

        int choose = 0;

        while (choose != 4) {
            System.out.println("1 - Make order");
            System.out.println("2 - yous orders");
            System.out.println("3 - out and issuing a check\n");
            choose = Input.inputNum();
            switch (choose) {
                case 1:
                    Order.printDishes();
                    String dish = Input.inputLetter();
                    Order.addToOrder(dish);
                    break;
                case 2:
                    Order.printOrder();
                    break;

                case 3:
                    Order.calculateOrder();
                    break;
                default:

            }


        }


    }
}
