package com.api.catalogoProducto.persistence.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "nombre_categoria")
    private String nombreCategoria;

    //@OneToMany(mappedBy = "categoria")
    //private List<Producto> productos;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
