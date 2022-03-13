package com.api.catalogoProducto.persistence;

import com.api.catalogoProducto.persistence.crud.ProductoCrudRepository;
import com.api.catalogoProducto.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//estamos indicando que tipo de componente es a diferencia de la anotacion componet
// esta clase esta interacu
@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        //iterable casting list de productos
        //return  productoCrudRepository.findAll();
        return (List<Producto>) productoCrudRepository.findAll();
    }


    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }

    /*no es util en este project
    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }*/

    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
