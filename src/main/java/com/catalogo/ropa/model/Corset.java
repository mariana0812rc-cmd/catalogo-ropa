package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "corsets")
public class Corset extends PrendaSuperior {

    private String material;  // satén, encaje, cuero
    private String cierre;    // agujetas, cremallera, ganchos

    public Corset() {}

    public Corset(String nombre, String marca, double precio,
                  String talla, String color,
                  String material, String cierre) {
        super(nombre, marca, precio, talla, color);
        this.material = material;
        this.cierre = cierre;
    }

    @Override
    public String getTipo() { return "Corset"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getCierre() { return cierre; }
    public void setCierre(String cierre) { this.cierre = cierre; }
}