package com.company.Clases;

public class SmartWatch extends SmartDevice{

    String color;
    boolean medidorPulsaciones;
    boolean pantalalTactil;

    public SmartWatch() {

    }

    public SmartWatch(String marca, String tipo, int precio, String sistemaOperativo, long bateria, boolean cargaRapida, int almacenamiento, String color, boolean medidorPulsaciones, boolean pantalalTactil) {
        super(marca, tipo, precio, sistemaOperativo, bateria, cargaRapida, almacenamiento);
        this.color = color;
        this.medidorPulsaciones = medidorPulsaciones;
        this.pantalalTactil = pantalalTactil;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", bateria=" + bateria +
                ", cargaRapida=" + cargaRapida +
                ", almacenamiento=" + almacenamiento +
                ", color='" + color + '\'' +
                ", medidorPulsaciones=" + medidorPulsaciones +
                ", pantalalTactil=" + pantalalTactil +
                '}';
    }
}
