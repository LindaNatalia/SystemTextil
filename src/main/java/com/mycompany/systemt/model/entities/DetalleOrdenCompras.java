/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemt.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author natalia
 */
@Entity
@Table(name = "detalle_orden_compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleOrdenCompras.findAll", query = "SELECT d FROM DetalleOrdenCompras d"),
    @NamedQuery(name = "DetalleOrdenCompras.findByIddetalleOrdenCompra", query = "SELECT d FROM DetalleOrdenCompras d WHERE d.iddetalleOrdenCompra = :iddetalleOrdenCompra"),
    @NamedQuery(name = "DetalleOrdenCompras.findByCantidadCompra", query = "SELECT d FROM DetalleOrdenCompras d WHERE d.cantidadCompra = :cantidadCompra"),
    @NamedQuery(name = "DetalleOrdenCompras.findByPrecioUnidad", query = "SELECT d FROM DetalleOrdenCompras d WHERE d.precioUnidad = :precioUnidad"),
    @NamedQuery(name = "DetalleOrdenCompras.findByTotalCompra", query = "SELECT d FROM DetalleOrdenCompras d WHERE d.totalCompra = :totalCompra")})
public class DetalleOrdenCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetalle_orden_compra")
    private Integer iddetalleOrdenCompra;
    @Size(max = 45)
    @Column(name = "cantidad_compra")
    private String cantidadCompra;
    @Column(name = "precio_unidad")
    private Long precioUnidad;
    @Column(name = "total_compra")
    private Long totalCompra;
    @JoinColumn(name = "orden_compra_idorden_compra", referencedColumnName = "idorden_compra")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrdenCompras ordenCompraIdordenCompra;
    @JoinColumn(name = "producto_idproducto", referencedColumnName = "idproducto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Productos productoIdproducto;

    public DetalleOrdenCompras() {
    }

    public DetalleOrdenCompras(Integer iddetalleOrdenCompra) {
        this.iddetalleOrdenCompra = iddetalleOrdenCompra;
    }

    public Integer getIddetalleOrdenCompra() {
        return iddetalleOrdenCompra;
    }

    public void setIddetalleOrdenCompra(Integer iddetalleOrdenCompra) {
        this.iddetalleOrdenCompra = iddetalleOrdenCompra;
    }

    public String getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(String cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    public Long getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Long precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Long getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Long totalCompra) {
        this.totalCompra = totalCompra;
    }

    public OrdenCompras getOrdenCompraIdordenCompra() {
        return ordenCompraIdordenCompra;
    }

    public void setOrdenCompraIdordenCompra(OrdenCompras ordenCompraIdordenCompra) {
        this.ordenCompraIdordenCompra = ordenCompraIdordenCompra;
    }

    public Productos getProductoIdproducto() {
        return productoIdproducto;
    }

    public void setProductoIdproducto(Productos productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalleOrdenCompra != null ? iddetalleOrdenCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleOrdenCompras)) {
            return false;
        }
        DetalleOrdenCompras other = (DetalleOrdenCompras) object;
        if ((this.iddetalleOrdenCompra == null && other.iddetalleOrdenCompra != null) || (this.iddetalleOrdenCompra != null && !this.iddetalleOrdenCompra.equals(other.iddetalleOrdenCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.systemt.model.entities.DetalleOrdenCompras[ iddetalleOrdenCompra=" + iddetalleOrdenCompra + " ]";
    }
    
}
