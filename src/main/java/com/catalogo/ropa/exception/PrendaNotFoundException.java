package com.catalogo.ropa.exception;

public class PrendaNotFoundException extends RuntimeException {

    public PrendaNotFoundException(String tipo, Long id) {
        super(tipo + " con id " + id + " no encontrada");
    }
}