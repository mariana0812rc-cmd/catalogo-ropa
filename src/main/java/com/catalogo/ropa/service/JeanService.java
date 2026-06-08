package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Jean;
import com.catalogo.ropa.repository.JeanRepository;
import org.springframework.stereotype.Service;

@Service
public class JeanService extends GenericPrendaService<Jean> {
    public JeanService(JeanRepository repo) { super(repo); }
}