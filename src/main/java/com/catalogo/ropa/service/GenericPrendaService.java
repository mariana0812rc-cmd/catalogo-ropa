// GenericPrendaService.java
package com.catalogo.ropa.service;
import com.catalogo.ropa.model.Prenda;
import com.catalogo.ropa.repository.PrendaRepository;
import java.util.List;
import com.catalogo.ropa.exception.PrendaNotFoundException;

public class GenericPrendaService<T extends Prenda> {
    protected final PrendaRepository<T> repo;
    public GenericPrendaService(PrendaRepository<T> repo) { this.repo = repo; }
    public List<T> obtenerTodos() { return repo.findAll(); }
    public List<T> obtenerDisponibles() { return repo.findByDisponibleTrue(); }
    public T obtenerPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new PrendaNotFoundException(
                        getClass().getSimpleName().replace("Service", ""), id
                ));
    }
    public T guardar(T item) { return repo.save(item); }
    public void eliminar(Long id) { repo.deleteById(id); }
}