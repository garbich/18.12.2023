package com.restorant;


public enum Dishes {
    PIZZA(200, false),
    BURGER(140, false),
    SANDWICH(50, false),

    PASTA(210, false),
    SALAD(100, false),
    TIRAMISU(110, false),
    CAKE(90,false),
    JELLY(95,false),
    ICECREAM(105,false),
    STEAK(230, false),
    WATER(25, false),
    WINE(65, false),
    SPRITE(45, false),
    COKE(45,false);

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

    Dishes(int value, boolean isDeleted) {
        this.value = value;
        this.isDeleted = false;
    }

    public static Dishes findByString(String value) {
        String temp = value.toUpperCase();
        for (Dishes dish : Dishes.values()) {
            if (dish.name().equals(temp)) {
                return dish;
            }
        }
        return null;
    }


}
