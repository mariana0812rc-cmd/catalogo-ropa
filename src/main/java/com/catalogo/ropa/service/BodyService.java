package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Body;
import com.catalogo.ropa.repository.BodyRepository;
import org.springframework.stereotype.Service;

@Service
public class BodyService extends GenericPrendaService<Body> {
    public BodyService(BodyRepository repo) { super(repo); }
}
