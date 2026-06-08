package com.catalogo.ropa.service;
import com.catalogo.ropa.model.FaldaMini;
import com.catalogo.ropa.repository.FaldaMiniRepository;
import org.springframework.stereotype.Service;

@Service
public class FaldaMiniService extends GenericPrendaService<FaldaMini> {
    public FaldaMiniService(FaldaMiniRepository repo) { super(repo); }
}