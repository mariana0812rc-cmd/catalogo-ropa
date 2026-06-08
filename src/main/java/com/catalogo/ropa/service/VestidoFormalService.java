package com.catalogo.ropa.service;
import com.catalogo.ropa.model.VestidoFormal;
import com.catalogo.ropa.repository.VestidoFormalRepository;
import org.springframework.stereotype.Service;

@Service
public class VestidoFormalService extends GenericPrendaService<VestidoFormal> {
    public VestidoFormalService(VestidoFormalRepository repo) { super(repo); }
}