package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Palazzo;
import com.catalogo.ropa.repository.PalazzoRepository;
import org.springframework.stereotype.Service;

@Service
public class PalazzoService extends GenericPrendaService<Palazzo> {
    public PalazzoService(PalazzoRepository repo) { super(repo); }
}
