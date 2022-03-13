package com.api.catalogoProducto.persistence.crud;

import com.api.catalogoProducto.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//la clase que hace de entity ademas del tipo de dato que esta compuesta la pk
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
   // @Query(value = "SELECT * fROM producto WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoria (int idCategoria);

    //no es util en este project
   // Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);


}
