package com.catalogo.ropa.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/imagenes")
@CrossOrigin(origins = "*")
public class ImagenController {

    private final Cloudinary cloudinary;

    public ImagenController() {
        String cloudName = System.getenv("CLOUDINARY_CLOUD_NAME");
        String apiKey   = System.getenv("CLOUDINARY_API_KEY");
        String apiSecret = System.getenv("CLOUDINARY_API_SECRET");
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", cloudName,
                "api_key",    apiKey,
                "api_secret", apiSecret
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

    @PostMapping("/subir-multiple")
    public ResponseEntity<Map<String, List<String>>> subirMultiple(
            @RequestParam("archivos") List<MultipartFile> archivos) throws IOException {
        List<String> urls = new ArrayList<>();
        for (MultipartFile archivo : archivos) {
            Map resultado = cloudinary.uploader().upload(
                    archivo.getBytes(),
                    ObjectUtils.asMap("folder", "estefania-aguirre")
            );
            urls.add((String) resultado.get("secure_url"));
        }
        return ResponseEntity.ok(Map.of("urls", urls));
    }
}