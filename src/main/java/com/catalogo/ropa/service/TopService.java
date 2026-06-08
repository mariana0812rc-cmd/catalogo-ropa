package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Top;
import com.catalogo.ropa.repository.TopRepository;
import org.springframework.stereotype.Service;

@Service
public class TopService extends GenericPrendaService<Top> {
    public TopService(TopRepository repo) { super(repo); }
}