package com.restorant;

public class Menu {
    public void start() {

        Order order = new Order();

        int choose = 0;

        while (choose != 3) {
            System.out.println("1 - Make order");
            System.out.println("2 - yous orders");
            System.out.println("4 - out and issuing a check\n");
            choose = Input.inputNum();
            switch (choose) {
                case 1:
                    order.printDishes();
                    String dish = Input.inputLetter();
                    order.addToOrder(dish);
                    break;
                case 2:
                    order.printOrder();
                    break;

                case 4:
                    order.calculateOrder();
                    break;
                default:

            }


        }


    }
}
