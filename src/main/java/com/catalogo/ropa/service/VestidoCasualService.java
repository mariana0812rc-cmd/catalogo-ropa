package com.catalogo.ropa.service;
import com.catalogo.ropa.model.VestidoCasual;
import com.catalogo.ropa.repository.VestidoCasualRepository;
import org.springframework.stereotype.Service;

@Service
public class VestidoCasualService extends GenericPrendaService<VestidoCasual> {
    public VestidoCasualService(VestidoCasualRepository repo) { super(repo); }
}