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

        }
        System.out.println(dishes + "not on menu");
    }


    public void printOrder(){
        for(Dishes dish : order){
            System.out.println(dish + "\n");
        }
    }

    public void printDishes(){
        for(Dishes dish : Dishes.values()){
            System.out.println(dish);
        }
    }

}
