package com.company;

import com.company.Clases.SmartDevice;
import com.company.Clases.SmartPhone;
import com.company.Clases.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartDevice movil= new SmartPhone( "Xiomi", "POCO X3", 10000, "Android 13.0", 4500, true, 256, 5, 128  );

        SmartDevice reloj= new SmartWatch("Xiomi", "SmartWatch", 3200, "Android 12", 3500, false, 64, "Blanco", true, true );

        System.out.println(movil.toString());
        System.out.println(reloj.toString());
    }
}
