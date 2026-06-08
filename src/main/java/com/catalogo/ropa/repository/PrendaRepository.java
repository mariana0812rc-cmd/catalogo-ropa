
package com.catalogo.ropa.repository;
import com.catalogo.ropa.model.Prenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import java.util.List;

@NoRepositoryBean
public interface PrendaRepository<T extends Prenda> extends JpaRepository<T, Long> {
    List<T> findByDisponibleTrue();
    List<T> findByColor(String color);
    List<T> findByTalla(String talla);
}