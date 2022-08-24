package com.example.DemoRest.ejemplo.Model;

public class Bootcampers {
    private String name;
    private long id;
    public Bootcampers(String name, long id) {this.name = name;this.id = id;}
    public Bootcampers() { }
    public String getName() { return name; }
    public void setName(String name) {this.name = name;}
    public long getId() {return id;}
    public void setId(long id) {this.id = id; }
}

