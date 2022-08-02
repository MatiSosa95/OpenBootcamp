package com.company.Clases;

public class SmartPhone extends SmartDevice{

    int pantalla;
    int almacenamientoExterno;

    public SmartPhone() {

    }

    public SmartPhone(String marca, String tipo, int precio, String sistemaOperativo, long bateria, boolean cargaRapida, int almacenamiento, int pantalla, int almacenamientoExterno) {
        super(marca, tipo, precio, sistemaOperativo, bateria, cargaRapida, almacenamiento);
        this.pantalla = pantalla;
        this.almacenamientoExterno = almacenamientoExterno;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", bateria=" + bateria +
                ", cargaRapida=" + cargaRapida +
                ", almacenamiento=" + almacenamiento +
                ", pantalla=" + pantalla +
                ", almacenamientoExterno=" + almacenamientoExterno +
                '}';
    }
}
