package com.spring.bootcamp;

import org.springframework.stereotype.Component;

//@Component
public class Tea implements HotDrink {

    public void prepareHotdrink() {

        System.out.println("Preparing tea!!");
    }
}
