package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sueteres")
public class Sueter extends PrendaSuperior {

    private String material;
    private String cuello;
    private String grosor;

    public Sueter() {}

    public Sueter(String nombre, String marca, double precio,
                  String talla, String color,
                  String material, String cuello, String grosor) {
        super(nombre, marca, precio, talla, color);
        this.material = material;
        this.cuello = cuello;
        this.grosor = grosor;
    }

    @Override
    public String getTipo() { return "Sueter"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getCuello() { return cuello; }
    public void setCuello(String cuello) { this.cuello = cuello; }
    public String getGrosor() { return grosor; }
    public void setGrosor(String grosor) { this.grosor = grosor; }
}