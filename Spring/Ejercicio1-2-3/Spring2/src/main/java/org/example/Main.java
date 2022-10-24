package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctext= new ClassPathXmlApplicationContext("beans.xml");

        UserService us= (UserService) ctext.getBean("UserService");

        System.out.println(us.ns.Saludo());
    }
}