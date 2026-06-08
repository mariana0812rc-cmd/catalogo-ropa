package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Corset;
import com.catalogo.ropa.repository.CorsetRepository;
import org.springframework.stereotype.Service;

@Service
public class CorsetService extends GenericPrendaService<Corset> {
    public CorsetService(CorsetRepository repo) { super(repo); }
}