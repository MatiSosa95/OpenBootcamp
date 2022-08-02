package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] nombre= {"John Lennon ", "Ringo Starr ", "Paul McCartney ", "George Harrison"};

       String txt="";

       for(int i=0;i<nombre.length;i++){
           txt+=nombre[i];
       }
        System.out.println(txt);
    }
}
