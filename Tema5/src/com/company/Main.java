package com.company;

public class Main {

    static CocheCRUDImpl cocheCrud= new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCrud.save(new Coche());
        cocheCrud.findAll();
        cocheCrud.delete(new Coche());

    }
}
