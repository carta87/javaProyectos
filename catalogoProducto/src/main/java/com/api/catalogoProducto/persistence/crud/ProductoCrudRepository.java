package com.api.catalogoProducto.persistence.crud;

import com.api.catalogoProducto.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

//la clase que hace de entity ademas del tipo de dato que esta compuesta la pk
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
