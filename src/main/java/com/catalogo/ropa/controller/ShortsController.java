package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Shorts;
import com.catalogo.ropa.service.ShortsService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/shorts") @CrossOrigin(origins = "*")
public class ShortsController extends GenericPrendaController<Shorts> {
    public ShortsController(ShortsService s) { super(s); }
}