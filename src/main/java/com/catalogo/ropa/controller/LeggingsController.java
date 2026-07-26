package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Leggings;
import com.catalogo.ropa.service.LeggingsService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/leggings") @CrossOrigin(origins = "*")
public class LeggingsController extends GenericPrendaController<Leggings> {
    public LeggingsController(LeggingsService s) { super(s); }
}