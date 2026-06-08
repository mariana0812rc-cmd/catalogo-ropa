package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Top;
import com.catalogo.ropa.service.TopService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/api/tops") @CrossOrigin(origins = "*")
public class TopController extends GenericPrendaController<Top> {
    public TopController(TopService s) { super(s); }
}