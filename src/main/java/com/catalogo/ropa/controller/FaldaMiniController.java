package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.FaldaMini;
import com.catalogo.ropa.service.FaldaMiniService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/faldas-mini") @CrossOrigin(origins = "*")
public class FaldaMiniController extends GenericPrendaController<FaldaMini> {
    public FaldaMiniController(FaldaMiniService s) { super(s); }
}