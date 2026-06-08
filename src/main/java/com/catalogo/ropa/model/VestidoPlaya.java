package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vestidos_playa")
public class VestidoPlaya extends PrendaVestido {

    private String material;  // lino, algodón, crochet
    private String tirantes;  // con tirantes, sin tirantes, halter

    public VestidoPlaya() {}

    public VestidoPlaya(String nombre, String marca, double precio,
                        String talla, String color, String largo,
                        String material, String tirantes) {
        super(nombre, marca, precio, talla, color, largo, "playa");
        this.material = material;
        this.tirantes = tirantes;
    }

    @Override
    public String getTipo() { return "Vestido Playa"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getTirantes() { return tirantes; }
    public void setTirantes(String tirantes) { this.tirantes = tirantes; }
}