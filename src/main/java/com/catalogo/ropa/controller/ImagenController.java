package com.catalogo.ropa.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api/imagenes")
@CrossOrigin(origins = "*")
public class ImagenController {

    private final Cloudinary cloudinary;

    public ImagenController() {
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", System.getenv("CLOUDINARY_CLOUD_NAME"),
                "api_key",    System.getenv("CLOUDINARY_API_KEY"),
                "api_secret", System.getenv("CLOUDINARY_API_SECRET")
        ));
    }

    @PostMapping("/subir")
    public ResponseEntity<Map<String, String>> subirImagen(
            @RequestParam("archivo") MultipartFile archivo) throws IOException {

        Map resultado = cloudinary.uploader().upload(
                archivo.getBytes(),
                ObjectUtils.asMap("folder", "estefania-aguirre")
        );

        String url = (String) resultado.get("secure_url");
        return ResponseEntity.ok(Map.of("url", url));
    }
}