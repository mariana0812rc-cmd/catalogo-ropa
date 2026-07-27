package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Jumper;
import com.catalogo.ropa.repository.JumperRepository;
import org.springframework.stereotype.Service;

@Service
public class JumperService extends GenericPrendaService<Jumper> {
    public JumperService(JumperRepository repo) { super(repo); }
}
