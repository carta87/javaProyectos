package com.api.catalogoProducto.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String nombre;

    private Integer cantidad;

    private  Integer valor;

    private String descrpricion;

    private String imagen;

    //atrributo para establecer la recion entre las tablas
    //varios productos a una categoria
    //@ManyToOne
    //@JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    //private Categoria categoria;



    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescrpricion() {
        return descrpricion;
    }

    public void setDescrpricion(String descrpricion) {
        this.descrpricion = descrpricion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
