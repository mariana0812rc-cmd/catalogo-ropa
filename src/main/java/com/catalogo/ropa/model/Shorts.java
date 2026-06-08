package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shorts")
public class Shorts extends PrendaInferior {

    private String material;
    private String largo;

    public Shorts() {}

    public Shorts(String nombre, String marca, double precio,
                  String talla, String color, String corte,
                  String material, String largo) {
        super(nombre, marca, precio, talla, color, corte);
        this.material = material;
        this.largo = largo;
    }

    @Override
    public String getTipo() { return "Shorts"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getLargo() { return largo; }
    public void setLargo(String largo) { this.largo = largo; }
}