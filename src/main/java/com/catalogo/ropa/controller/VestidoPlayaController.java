package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.VestidoPlaya;
import com.catalogo.ropa.service.VestidoPlayaService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/vestidos-playa") @CrossOrigin(origins = "*")
public class VestidoPlayaController extends GenericPrendaController<VestidoPlaya> {
    public VestidoPlayaController(VestidoPlayaService s) { super(s); }
}