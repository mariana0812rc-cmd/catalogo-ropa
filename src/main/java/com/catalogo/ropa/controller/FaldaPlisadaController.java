package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.FaldaPlisada;
import com.catalogo.ropa.service.FaldaPlisadaService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/faldas-plisadas") @CrossOrigin(origins = "*")
public class FaldaPlisadaController extends GenericPrendaController<FaldaPlisada> {
    public FaldaPlisadaController(FaldaPlisadaService s) { super(s); }
}