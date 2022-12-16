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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p"),
    @NamedQuery(name = "Productos.findByIdproducto", query = "SELECT p FROM Productos p WHERE p.idproducto = :idproducto"),
    @NamedQuery(name = "Productos.findByNombreProducto", query = "SELECT p FROM Productos p WHERE p.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "Productos.findByDescripcion", query = "SELECT p FROM Productos p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Productos.findByUnidadMedida", query = "SELECT p FROM Productos p WHERE p.unidadMedida = :unidadMedida"),
    @NamedQuery(name = "Productos.findByPrecioUnidad", query = "SELECT p FROM Productos p WHERE p.precioUnidad = :precioUnidad"),
    @NamedQuery(name = "Productos.findByStock", query = "SELECT p FROM Productos p WHERE p.stock = :stock")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproducto")
    private Integer idproducto;
    @Size(max = 45)
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "unidad_medida")
    private Integer unidadMedida;
    @Column(name = "precio_unidad")
    private Long precioUnidad;
    @Column(name = "stock")
    private Integer stock;
    @JoinTable(name = "proveedores_producto", joinColumns = {
        @JoinColumn(name = "producto_idproducto", referencedColumnName = "idproducto")}, inverseJoinColumns = {
        @JoinColumn(name = "proveedor_idproveedor", referencedColumnName = "idproveedor")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Proveedores> proveedoresList;
    @OneToMany(mappedBy = "productoIdproducto", fetch = FetchType.LAZY)
    private List<DetalleOrdenVentas> detalleOrdenVentasList;
    @OneToMany(mappedBy = "productoIdproducto", fetch = FetchType.LAZY)
    private List<DetalleOrdenCompras> detalleOrdenComprasList;
    @JoinColumn(name = "color_idcolor", referencedColumnName = "idcolor")
    @ManyToOne(fetch = FetchType.LAZY)
    private Colores colorIdcolor;

    public Productos() {
    }

    public Productos(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(Integer unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Long getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Long precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @XmlTransient
    public List<Proveedores> getProveedoresList() {
        return proveedoresList;
    }

    public void setProveedoresList(List<Proveedores> proveedoresList) {
        this.proveedoresList = proveedoresList;
    }

    @XmlTransient
    public List<DetalleOrdenVentas> getDetalleOrdenVentasList() {
        return detalleOrdenVentasList;
    }

    public void setDetalleOrdenVentasList(List<DetalleOrdenVentas> detalleOrdenVentasList) {
        this.detalleOrdenVentasList = detalleOrdenVentasList;
    }

    @XmlTransient
    public List<DetalleOrdenCompras> getDetalleOrdenComprasList() {
        return detalleOrdenComprasList;
    }

    public void setDetalleOrdenComprasList(List<DetalleOrdenCompras> detalleOrdenComprasList) {
        this.detalleOrdenComprasList = detalleOrdenComprasList;
    }

    public Colores getColorIdcolor() {
        return colorIdcolor;
    }

    public void setColorIdcolor(Colores colorIdcolor) {
        this.colorIdcolor = colorIdcolor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.systemt.model.entities.Productos[ idproducto=" + idproducto + " ]";
    }
    
}
