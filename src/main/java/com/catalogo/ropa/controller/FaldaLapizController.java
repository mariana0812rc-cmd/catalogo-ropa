package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.FaldaLapiz;
import com.catalogo.ropa.service.FaldaLapizService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/faldas-lapiz") @CrossOrigin(origins = "*")
public class FaldaLapizController extends GenericPrendaController<FaldaLapiz> {
    public FaldaLapizController(FaldaLapizService s) { super(s); }
}