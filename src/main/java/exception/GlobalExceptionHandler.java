package com.catalogo.ropa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.Map;

@RestControllerAdvice  // Intercepta errores de TODOS los controllers
public class GlobalExceptionHandler {

    // Maneja cuando no se encuentra una prenda
    @ExceptionHandler(PrendaNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleNotFound(PrendaNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of(
                "error",  ex.getMessage(),
                "status", 404,
                "timestamp", LocalDateTime.now().toString()
        ));
    }

    // Maneja cualquier otro error inesperado
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGeneral(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of(
                "error",  "Error interno del servidor",
                "status", 500,
                "timestamp", LocalDateTime.now().toString()
        ));
    }
}