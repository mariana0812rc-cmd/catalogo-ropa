package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.VestidoCasual;
import com.catalogo.ropa.service.VestidoCasualService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/vestidos-casual") @CrossOrigin(origins = "*")
public class VestidoCasualController extends GenericPrendaController<VestidoCasual> {
    public VestidoCasualController(VestidoCasualService s) { super(s); }
}