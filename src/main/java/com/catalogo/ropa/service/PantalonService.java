package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Pantalon;
import com.catalogo.ropa.repository.PantalonRepository;
import org.springframework.stereotype.Service;

@Service
public class PantalonService extends GenericPrendaService<Pantalon> {
    public PantalonService(PantalonRepository repo) { super(repo); }
}