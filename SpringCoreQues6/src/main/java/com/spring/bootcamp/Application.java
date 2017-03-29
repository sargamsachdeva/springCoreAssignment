package com.spring.bootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Restaurant restaurant = applicationContext.getBean("restaurant",Restaurant.class);
        Restaurant restaurant2 = applicationContext.getBean("restaurant2",Restaurant.class);
       // Restaurant restaurant3 = applicationContext.getBean("restaurant3",Restaurant.class);
        restaurant.printDrink();
        restaurant2.printDrink();
        //restaurant3.printDrink(); //getting through constructor
        System.out.println(applicationContext.isPrototype("teaBean"));
    }
}
