package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Blusa;
import com.catalogo.ropa.service.BlusaService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/blusas") @CrossOrigin(origins = "*")
public class BlusaController extends GenericPrendaController<Blusa> {
    public BlusaController(BlusaService s) { super(s); }
}