package com.company.Clases;

public abstract  class SmartDevice {

    protected String marca;
    protected String tipo;
    protected int precio;
    protected String sistemaOperativo;
    protected long bateria;
    protected boolean cargaRapida;
    protected int almacenamiento;

    public SmartDevice() {

    }

    public SmartDevice(String marca, String tipo, int precio, String sistemaOperativo, long bateria, boolean cargaRapida, int almacenamiento) {
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.bateria = bateria;
        this.cargaRapida = cargaRapida;
        this.almacenamiento = almacenamiento;
    }
}
