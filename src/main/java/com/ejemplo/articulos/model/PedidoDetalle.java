package com.ejemplo.articulos.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido_detalles")
public class PedidoDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;
    private Double precio;

    //muchos detalles pueden pertenecer a un pedido
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    //muchos detalles pueden pertenecer a un articulo
    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    //constructores, getters y setters
    public PedidoDetalle() {}

    public PedidoDetalle(Long id, Integer cantidad, Double precio, Pedido pedido, Articulo articulo) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.pedido = pedido;
        this.articulo = articulo;
    }

    // getters y setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Articulo getArticulo() {
        return articulo;
    }
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

}
