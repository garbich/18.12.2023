package MyPackage;

import java.util.ArrayList;
import java.util.List;

public enum Dishes {
    PIZZA(200, false),
    BURGER(140, false),
    SANDWICH(50, false),

    PASTA(210, false),
    SALAD(100, false),
    DESSERT(110, false),
    MEAT(230, false),
    WATER(25, false),
    WINE(65, false),
    SPRITE(45, false);

    private int value;
    private boolean isDeleted;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    Dishes(int value, boolean isdeleted) {
        this.value = value;
        this.isDeleted = false;
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
