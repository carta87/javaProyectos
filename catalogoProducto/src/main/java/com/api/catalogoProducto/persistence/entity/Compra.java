package com.api.catalogoProducto.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "id_venta")
    private Integer idVenta;

    @Column(name = "medio_pago")
    private String medioPago;

    //cuando la llave es compuesta se utiliza
    //@ManyToOne
    //@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    //private Cliente cliente;


    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
}
