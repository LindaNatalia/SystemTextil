/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemt.model.entities;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author natalia
 */
@Entity
@Table(name = "detalle_orden_ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleOrdenVentas.findAll", query = "SELECT d FROM DetalleOrdenVentas d"),
    @NamedQuery(name = "DetalleOrdenVentas.findByIddetalleOrdenVenta", query = "SELECT d FROM DetalleOrdenVentas d WHERE d.iddetalleOrdenVenta = :iddetalleOrdenVenta"),
    @NamedQuery(name = "DetalleOrdenVentas.findByCantidadVenta", query = "SELECT d FROM DetalleOrdenVentas d WHERE d.cantidadVenta = :cantidadVenta"),
    @NamedQuery(name = "DetalleOrdenVentas.findByPrecioUnidad", query = "SELECT d FROM DetalleOrdenVentas d WHERE d.precioUnidad = :precioUnidad"),
    @NamedQuery(name = "DetalleOrdenVentas.findByTotalVenta", query = "SELECT d FROM DetalleOrdenVentas d WHERE d.totalVenta = :totalVenta")})
public class DetalleOrdenVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetalle_orden_venta")
    private Integer iddetalleOrdenVenta;
    @Size(max = 45)
    @Column(name = "cantidad_venta")
    private String cantidadVenta;
    @Column(name = "precio_unidad")
    private Long precioUnidad;
    @Column(name = "total_venta")
    private Long totalVenta;
    @JoinColumn(name = "orden_venta_idorden_venta", referencedColumnName = "idorden_venta")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrdenVentas ordenVentaIdordenVenta;
    @JoinColumn(name = "producto_idproducto", referencedColumnName = "idproducto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Productos productoIdproducto;
    @OneToMany(mappedBy = "detalleordenventaId", fetch = FetchType.LAZY)
    private List<OrdenEntregas> ordenEntregasList;

    public DetalleOrdenVentas() {
    }

    public DetalleOrdenVentas(Integer iddetalleOrdenVenta) {
        this.iddetalleOrdenVenta = iddetalleOrdenVenta;
    }

    public Integer getIddetalleOrdenVenta() {
        return iddetalleOrdenVenta;
    }

    public void setIddetalleOrdenVenta(Integer iddetalleOrdenVenta) {
        this.iddetalleOrdenVenta = iddetalleOrdenVenta;
    }

    public String getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(String cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public Long getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Long precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Long getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Long totalVenta) {
        this.totalVenta = totalVenta;
    }

    public OrdenVentas getOrdenVentaIdordenVenta() {
        return ordenVentaIdordenVenta;
    }

    public void setOrdenVentaIdordenVenta(OrdenVentas ordenVentaIdordenVenta) {
        this.ordenVentaIdordenVenta = ordenVentaIdordenVenta;
    }

    public Productos getProductoIdproducto() {
        return productoIdproducto;
    }

    public void setProductoIdproducto(Productos productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }

    @XmlTransient
    public List<OrdenEntregas> getOrdenEntregasList() {
        return ordenEntregasList;
    }

    public void setOrdenEntregasList(List<OrdenEntregas> ordenEntregasList) {
        this.ordenEntregasList = ordenEntregasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalleOrdenVenta != null ? iddetalleOrdenVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleOrdenVentas)) {
            return false;
        }
        DetalleOrdenVentas other = (DetalleOrdenVentas) object;
        if ((this.iddetalleOrdenVenta == null && other.iddetalleOrdenVenta != null) || (this.iddetalleOrdenVenta != null && !this.iddetalleOrdenVenta.equals(other.iddetalleOrdenVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.systemt.model.entities.DetalleOrdenVentas[ iddetalleOrdenVenta=" + iddetalleOrdenVenta + " ]";
    }
    
}
