package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Pantalon;
import com.catalogo.ropa.service.PantalonService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/pantalones") @CrossOrigin(origins = "*")
public class PantalonController extends GenericPrendaController<Pantalon> {
    public PantalonController(PantalonService s) { super(s); }
}