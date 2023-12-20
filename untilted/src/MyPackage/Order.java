package MyPackage;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Dishes> order = new ArrayList<>();

    public void addToOrder(String value) {
        Dishes dishes = Dishes.findByString(value);

        if(dishes!= null){
            System.out.println(dishes + " " + "add to order");
            order.add(dishes);
            dishes.setDeleted(true);
        return;
        }
        System.out.println("dishes " + "not on menu");
    }

    private int sale(){
        int totalSale = 0;
        for(Dishes dish : order){
            if(dish == Dishes.PASTA){
                for(Dishes dishes : order){
                    if(dishes== Dishes.WINE){
                        totalSale += 30;
                    }
                }
            }
            if(dish == Dishes.SALAD) {
                totalSale =+ 10;
            }
            if(dish == Dishes.DESSERT) {
                totalSale =+ 15;
            }
            if(dish == Dishes.PIZZA){
                for(Dishes dishes : order) {
                    if (dishes == Dishes.SPRITE) {
                        totalSale += 33;
                    }
                }
            }
        }
        return totalSale;
    }

    public void calculateOrder() {
        int totalsum = 0;
        for(Dishes dish : order){
            totalsum += dish.getValue();
        }
        System.out.println("Total sum - " + (totalsum - sale()));
    }

    public void printOrder(){
        for(Dishes dish : order){
            System.out.println(dish);
        }
    }

    public void printDishes(){
        for(Dishes dish : Dishes.values()){
            if(dish.isDeleted() == false) {
                System.out.println(dish);
            }
        }
    }

}
