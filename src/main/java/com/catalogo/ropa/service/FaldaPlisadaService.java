package com.catalogo.ropa.service;
import com.catalogo.ropa.model.FaldaPlisada;
import com.catalogo.ropa.repository.FaldaPlisadaRepository;
import org.springframework.stereotype.Service;

@Service
public class FaldaPlisadaService extends GenericPrendaService<FaldaPlisada> {
    public FaldaPlisadaService(FaldaPlisadaRepository repo) { super(repo); }
}