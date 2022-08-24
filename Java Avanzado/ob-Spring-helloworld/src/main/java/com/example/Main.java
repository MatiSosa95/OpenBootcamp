package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml");
         calculatorService cs= (calculatorService) context.getBean("calculatorService");

        String txt= cs.holaMundo();

        System.out.println(txt);


    }


}
