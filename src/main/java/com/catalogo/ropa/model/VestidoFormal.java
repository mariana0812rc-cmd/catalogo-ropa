package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vestidos_formal")
public class VestidoFormal extends PrendaVestido {

    private String escote;   // recto, corazón, v, off-shoulder
    private boolean tren;    // true = tiene tren

    public VestidoFormal() {}

    public VestidoFormal(String nombre, String marca, double precio,
                         String talla, String color, String largo,
                         String escote, boolean tren) {
        super(nombre, marca, precio, talla, color, largo, "formal");
        this.escote = escote;
        this.tren = tren;
    }

    @Override
    public String getTipo() { return "Vestido Formal"; }

    public String getEscote() { return escote; }
    public void setEscote(String escote) { this.escote = escote; }
    public boolean isTren() { return tren; }
    public void setTren(boolean tren) { this.tren = tren; }
}