package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctxt= new ClassPathXmlApplicationContext("beans.xml");
         Saludo s= (Saludo) ctxt.getBean("Saludo");

        System.out.println(s.saludo());
    }
}