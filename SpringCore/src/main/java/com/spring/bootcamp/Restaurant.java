package com.spring.bootcamp;


public class Restaurant {

    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public void printDrink() {

        this.hotDrink.prepareHotdrink();
    }
/*
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
*/
    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}
