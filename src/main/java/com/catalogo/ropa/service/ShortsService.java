package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Shorts;
import com.catalogo.ropa.repository.ShortsRepository;
import org.springframework.stereotype.Service;

@Service
public class ShortsService extends GenericPrendaService<Shorts> {
    public ShortsService(ShortsRepository repo) { super(repo); }
}