package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Playera;
import com.catalogo.ropa.repository.PlayeraRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayeraService extends GenericPrendaService<Playera> {
    public PlayeraService(PlayeraRepository repo) { super(repo); }
}