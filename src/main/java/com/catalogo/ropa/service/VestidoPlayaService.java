package com.catalogo.ropa.service;
import com.catalogo.ropa.model.VestidoPlaya;
import com.catalogo.ropa.repository.VestidoPlayaRepository;
import org.springframework.stereotype.Service;

@Service
public class VestidoPlayaService extends GenericPrendaService<VestidoPlaya> {
    public VestidoPlayaService(VestidoPlayaRepository repo) { super(repo); }
}