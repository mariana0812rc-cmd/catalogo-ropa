package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Sueter;
import com.catalogo.ropa.service.SueterService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/sueteres") @CrossOrigin(origins = "*")
public class SueterController extends GenericPrendaController<Sueter> {
    public SueterController(SueterService s) { super(s); }
}