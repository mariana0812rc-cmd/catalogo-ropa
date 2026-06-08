package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Blusa;
import com.catalogo.ropa.repository.BlusaRepository;
import org.springframework.stereotype.Service;

@Service
public class BlusaService extends GenericPrendaService<Blusa> {
    public BlusaService(BlusaRepository repo) { super(repo); }
}