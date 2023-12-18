package MyPackage;

import java.util.ArrayList;
import java.util.List;

public enum Dishes {
    PIZZA(200),
    BURGER(140),
    SANDWICH(50),

    PASTA(210),
    SALAD(100),
    DESSERT(110),
    MEAT(230);

    private int value;

    Dishes(int value) {
        this.value = value;
    }

    public static Dishes findByString(String value) {
        String temp = value.toUpperCase();
        for(Dishes dish : Dishes.values()){
            if(dish.name().equals(temp)){
                return dish;
            }
        }
        return null;
    }


}
