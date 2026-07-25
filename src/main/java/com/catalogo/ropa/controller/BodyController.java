package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Body;
import com.catalogo.ropa.service.BodyService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/body") @CrossOrigin(origins = "*")
public class BodyController extends GenericPrendaController<Body> {
    public BodyController(BodyService s) { super(s); }
}