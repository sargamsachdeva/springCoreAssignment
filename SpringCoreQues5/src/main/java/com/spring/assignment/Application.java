package com.spring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Complex complex = applicationContext.getBean("complexBean",Complex.class);
        System.out.println(complex);
    }
}
