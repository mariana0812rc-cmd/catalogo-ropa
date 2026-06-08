package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Playera;
import com.catalogo.ropa.service.PlayeraService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/playeras") @CrossOrigin(origins = "*")
public class PlayeraController extends GenericPrendaController<Playera> {
    public PlayeraController(PlayeraService s) { super(s); }
}