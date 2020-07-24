package com.daonguyen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "Beans.xml");

        // create object A
        HelloWorld objectA = (HelloWorld) context.getBean("helloWorld");
        objectA.setMessage("I'm object A");
        objectA.getMessage();

        // create object B, object B reference to Singleton object
        HelloWorld objectB = (HelloWorld) context.getBean("helloWorld");
        objectB.getMessage();
    }
}
