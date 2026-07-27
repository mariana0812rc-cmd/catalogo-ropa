package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Blazer;
import com.catalogo.ropa.repository.BlazerRepository;
import org.springframework.stereotype.Service;

@Service
public class BlazerService extends GenericPrendaService<Blazer> {
    public BlazerService(BlazerRepository repo) { super(repo); }
}
