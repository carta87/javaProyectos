package com.api.catalogoProducto.persistence;

import com.api.catalogoProducto.persistence.crud.ProductoCrudRepository;
import com.api.catalogoProducto.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        //iterable casting list de productos
        //return  productoCrudRepository.findAll();
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
