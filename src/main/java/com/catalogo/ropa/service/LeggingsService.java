package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Leggings;
import com.catalogo.ropa.repository.LeggingsRepository;
import org.springframework.stereotype.Service;

@Service
public class LeggingsService extends GenericPrendaService<Leggings> {
    public LeggingsService(LeggingsRepository repo) { super(repo); }
}