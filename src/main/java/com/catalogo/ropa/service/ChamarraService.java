package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Chamarra;
import com.catalogo.ropa.repository.ChamarraRepository;
import org.springframework.stereotype.Service;

@Service
public class ChamarraService extends GenericPrendaService<Chamarra> {
    public ChamarraService(ChamarraRepository repo) { super(repo); }
}