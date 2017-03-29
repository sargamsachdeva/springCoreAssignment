package com.spring.bootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Restaurant restaurant = applicationContext.getBean("restaurant",Restaurant.class);
        restaurant.printDrink();
    }
}
