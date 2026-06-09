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

    private final Path carpeta = Paths.get("static/uploads");

    @PostMapping("/subir")
    public ResponseEntity<Map<String, String>> subirImagen(
            @RequestParam("archivo") MultipartFile archivo) throws IOException {

        Files.createDirectories(carpeta);

        String extension = archivo.getOriginalFilename()
                .substring(archivo.getOriginalFilename().lastIndexOf("."));
        String nombreArchivo = UUID.randomUUID().toString() + extension;

        Path destino = carpeta.resolve(nombreArchivo);
        Files.copy(archivo.getInputStream(), destino, StandardCopyOption.REPLACE_EXISTING);

        String url = "/uploads/" + nombreArchivo;
        return ResponseEntity.ok(Map.of("url", url));
    }
}