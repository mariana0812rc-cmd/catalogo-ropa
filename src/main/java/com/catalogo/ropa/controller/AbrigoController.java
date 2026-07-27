package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Abrigo;
import com.catalogo.ropa.service.AbrigoService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/abrigos") @CrossOrigin(origins = "*")
public class AbrigoController extends GenericPrendaController<Abrigo> {
    public AbrigoController(AbrigoService s) { super(s); }
}