package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Corset;
import com.catalogo.ropa.service.CorsetService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/corsets") @CrossOrigin(origins = "*")
public class CorsetController extends GenericPrendaController<Corset> {
    public CorsetController(CorsetService s) { super(s); }
}