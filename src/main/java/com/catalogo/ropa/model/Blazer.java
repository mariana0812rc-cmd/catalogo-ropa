package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "blazers")
public class Blazer extends PrendaSuperior {

    private String material;   // cuero, mezclilla, nylon, lana
    private String largo;     // cremallera, botones, ninguno


    public Blazer() {}

    public Blazer(String nombre, String marca, double precio,
                    String talla, String color,
                    String material, String largo) {
        super(nombre, marca, precio, talla, color);
        this.material = material;
        this.largo = largo;

    }

    @Override
    public String getTipo() { return "Blazer"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getLargo() { return largo; }
    public void setLargo(String largo) { this.largo = largo; }

}