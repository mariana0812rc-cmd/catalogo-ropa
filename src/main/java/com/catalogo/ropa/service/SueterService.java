package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Sueter;
import com.catalogo.ropa.repository.SueterRepository;
import org.springframework.stereotype.Service;

@Service
public class SueterService extends GenericPrendaService<Sueter> {
    public SueterService(SueterRepository repo) { super(repo); }
}