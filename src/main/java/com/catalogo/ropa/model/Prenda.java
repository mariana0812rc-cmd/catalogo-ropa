package com.catalogo.ropa.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Prenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String marca;
    private double precio;
    private boolean disponible;

    public Prenda() {}

    public Prenda(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.disponible = true;
    }

    public abstract String getTipo();

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }


    private String imagenUrl;
    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }
}