package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.VestidoFormal;
import com.catalogo.ropa.service.VestidoFormalService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/vestidos-formal") @CrossOrigin(origins = "*")
public class VestidoFormalController extends GenericPrendaController<VestidoFormal> {
    public VestidoFormalController(VestidoFormalService s) { super(s); }
}