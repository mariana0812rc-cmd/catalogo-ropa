package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Chamarra;
import com.catalogo.ropa.service.ChamarraService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/chamarras") @CrossOrigin(origins = "*")
public class ChamarraController extends GenericPrendaController<Chamarra> {
    public ChamarraController(ChamarraService s) { super(s); }
}