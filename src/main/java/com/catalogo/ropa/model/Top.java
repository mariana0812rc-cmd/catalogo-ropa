package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tops")
public class Top extends PrendaSuperior {

    private String estilo;  // crop, halter, tubo, bandeau

    public Top() {}

    public Top(String nombre, String marca, double precio,
               String talla, String color, String estilo) {
        super(nombre, marca, precio, talla, color);
        this.estilo = estilo;
    }

    @Override
    public String getTipo() { return "Top"; }

    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }
}