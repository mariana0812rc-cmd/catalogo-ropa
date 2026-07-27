package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Jumper;
import com.catalogo.ropa.service.JumperService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/jumpers") @CrossOrigin(origins = "*")
public class JumperController extends GenericPrendaController<Jumper> {
    public JumperController(JumperService s) { super(s); }
}
