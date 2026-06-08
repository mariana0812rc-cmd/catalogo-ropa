package com.catalogo.ropa.controller;
import com.catalogo.ropa.model.Prenda;
import com.catalogo.ropa.service.GenericPrendaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public abstract class GenericPrendaController<T extends Prenda> {
    protected final GenericPrendaService<T> service;
    public GenericPrendaController(GenericPrendaService<T> service) { this.service = service; }

    @GetMapping
    public List<T> todos() { return service.obtenerTodos(); }
    @GetMapping("/disponibles")
    public List<T> disponibles() { return service.obtenerDisponibles(); }
    @GetMapping("/{id}")
    public T porId(@PathVariable Long id) { return service.obtenerPorId(id); }
    @PostMapping
    public T crear(@RequestBody T item) { return service.guardar(item); }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) { service.eliminar(id); }




    @PutMapping("/{id}")
    public T actualizar(@PathVariable Long id, @RequestBody T item) {
        item.setId(id);
        return service.guardar(item);
    }
}