/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemt.model.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author natalia
 */
@Entity
@Table(name = "novedades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Novedades.findAll", query = "SELECT n FROM Novedades n"),
    @NamedQuery(name = "Novedades.findByIdnovedad", query = "SELECT n FROM Novedades n WHERE n.idnovedad = :idnovedad"),
    @NamedQuery(name = "Novedades.findByTipoNovedad", query = "SELECT n FROM Novedades n WHERE n.tipoNovedad = :tipoNovedad"),
    @NamedQuery(name = "Novedades.findByDescripcion", query = "SELECT n FROM Novedades n WHERE n.descripcion = :descripcion"),
    @NamedQuery(name = "Novedades.findByFecha", query = "SELECT n FROM Novedades n WHERE n.fecha = :fecha")})
public class Novedades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnovedad")
    private Integer idnovedad;
    @Size(max = 45)
    @Column(name = "tipo_novedad")
    private String tipoNovedad;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "ordencompra_id", referencedColumnName = "idorden_compra")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrdenCompras ordencompraId;
    @JoinColumn(name = "ordenentrega_id", referencedColumnName = "idorden_entrega")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrdenEntregas ordenentregaId;
    @JoinColumn(name = "ordenventa_id", referencedColumnName = "idorden_venta")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrdenVentas ordenventaId;

    public Novedades() {
    }

    public Novedades(Integer idnovedad) {
        this.idnovedad = idnovedad;
    }

    public Integer getIdnovedad() {
        return idnovedad;
    }

    public void setIdnovedad(Integer idnovedad) {
        this.idnovedad = idnovedad;
    }

    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public OrdenCompras getOrdencompraId() {
        return ordencompraId;
    }

    public void setOrdencompraId(OrdenCompras ordencompraId) {
        this.ordencompraId = ordencompraId;
    }

    public OrdenEntregas getOrdenentregaId() {
        return ordenentregaId;
    }

    public void setOrdenentregaId(OrdenEntregas ordenentregaId) {
        this.ordenentregaId = ordenentregaId;
    }

    public OrdenVentas getOrdenventaId() {
        return ordenventaId;
    }

    public void setOrdenventaId(OrdenVentas ordenventaId) {
        this.ordenventaId = ordenventaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnovedad != null ? idnovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Novedades)) {
            return false;
        }
        Novedades other = (Novedades) object;
        if ((this.idnovedad == null && other.idnovedad != null) || (this.idnovedad != null && !this.idnovedad.equals(other.idnovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.systemt.model.entities.Novedades[ idnovedad=" + idnovedad + " ]";
    }
    
}
