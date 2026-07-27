package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Palazzo;
import com.catalogo.ropa.service.PalazzoService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/palazzos") @CrossOrigin(origins = "*")
public class PalazzoController extends GenericPrendaController<Palazzo> {
    public PalazzoController(PalazzoService s) { super(s); }
}