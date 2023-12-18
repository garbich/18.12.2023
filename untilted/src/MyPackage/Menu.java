package MyPackage;

import java.util.Scanner;

public class Menu
{
    public void start(){

        Order order = new Order();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        order.printDishes();

        System.out.println("Please make order:\n");

        String a = scanner.next();
        order.addToOrder(a);
    }
}
