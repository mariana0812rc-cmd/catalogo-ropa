package com.catalogo.ropa.service;
import com.catalogo.ropa.model.FaldaLapiz;
import com.catalogo.ropa.repository.FaldaLapizRepository;
import org.springframework.stereotype.Service;

@Service
public class FaldaLapizService extends GenericPrendaService<FaldaLapiz> {
    public FaldaLapizService(FaldaLapizRepository repo) { super(repo); }
}