package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vestidos_casual")
public class VestidoCasual extends PrendaVestido {

    private String estampado;  // liso, flores, rayas, lunares
    private String manga;      // sin manga, corta, larga

    public VestidoCasual() {}

    public VestidoCasual(String nombre, String marca, double precio,
                         String talla, String color, String largo,
                         String estampado, String manga) {
        super(nombre, marca, precio, talla, color, largo, "casual");
        this.estampado = estampado;
        this.manga = manga;
    }

    @Override
    public String getTipo() { return "Vestido Casual"; }

    public String getEstampado() { return estampado; }
    public void setEstampado(String estampado) { this.estampado = estampado; }
    public String getManga() { return manga; }
    public void setManga(String manga) { this.manga = manga; }
}