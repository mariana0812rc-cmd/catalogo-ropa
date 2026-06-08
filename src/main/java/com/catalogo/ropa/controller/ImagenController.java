package com.catalogo.ropa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.*;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/imagenes")
@CrossOrigin(origins = "*")
public class ImagenController {

    // Carpeta donde se guardan las fotos dentro del proyecto
    private final Path carpeta = Paths.get("src/main/resources/static/uploads");

    @PostMapping("/subir")
    public ResponseEntity<Map<String, String>> subirImagen(
            @RequestParam("archivo") MultipartFile archivo) throws IOException {

        // Crear la carpeta si no existe
        Files.createDirectories(carpeta);

        // Generar nombre único para evitar duplicados
        String extension = archivo.getOriginalFilename()
                .substring(archivo.getOriginalFilename().lastIndexOf("."));
        String nombreArchivo = UUID.randomUUID().toString() + extension;

        // Guardar el archivo en disco
        Path destino = carpeta.resolve(nombreArchivo);
        Files.copy(archivo.getInputStream(), destino, StandardCopyOption.REPLACE_EXISTING);

        // Devolver la URL pública
        String url = "/uploads/" + nombreArchivo;
        return ResponseEntity.ok(Map.of("url", url));
    }
}