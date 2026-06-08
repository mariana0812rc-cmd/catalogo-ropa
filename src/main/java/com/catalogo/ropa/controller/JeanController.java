package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Jean;
import com.catalogo.ropa.service.JeanService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/jeans") @CrossOrigin(origins = "*")
public class JeanController extends GenericPrendaController<Jean> {
    public JeanController(JeanService s) { super(s); }
}