package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "Beans.xml");

      calculatorService cs= (calculatorService) context.getBean("calculatorService");

        System.out.println(cs.helloWorld());
    }
}