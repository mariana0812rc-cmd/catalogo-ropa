package com.catalogo.ropa.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminCheckController {

    @GetMapping("/check")
    public String check() {
        return "ok";
    }
}