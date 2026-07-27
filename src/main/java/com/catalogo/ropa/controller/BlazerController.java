package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Blazer;
import com.catalogo.ropa.service.BlazerService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/blazers") @CrossOrigin(origins = "*")
public class BlazerController extends GenericPrendaController<Blazer> {
    public BlazerController(BlazerService s) { super(s); }
}
