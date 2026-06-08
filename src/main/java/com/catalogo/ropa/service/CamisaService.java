package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Camisa;
import com.catalogo.ropa.repository.CamisaRepository;
import org.springframework.stereotype.Service;

@Service
public class CamisaService extends GenericPrendaService<Camisa> {
    public CamisaService(CamisaRepository repo) { super(repo); }
}