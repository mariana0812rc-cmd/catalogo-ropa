package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Abrigo;
import com.catalogo.ropa.repository.AbrigoRepository;
import org.springframework.stereotype.Service;

@Service
public class AbrigoService extends GenericPrendaService<Abrigo> {
    public AbrigoService(AbrigoRepository repo) { super(repo); }
}
