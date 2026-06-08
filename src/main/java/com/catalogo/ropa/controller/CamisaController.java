package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Camisa;
import com.catalogo.ropa.service.CamisaService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/camisas") @CrossOrigin(origins = "*")
public class CamisaController extends GenericPrendaController<Camisa> {
    public CamisaController(CamisaService s) { super(s); }
}