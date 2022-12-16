/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemt.model.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author natalia
 */
@Entity
@Table(name = "orden_ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenVentas.findAll", query = "SELECT o FROM OrdenVentas o"),
    @NamedQuery(name = "OrdenVentas.findByIdordenVenta", query = "SELECT o FROM OrdenVentas o WHERE o.idordenVenta = :idordenVenta"),
    @NamedQuery(name = "OrdenVentas.findByFechaVenta", query = "SELECT o FROM OrdenVentas o WHERE o.fechaVenta = :fechaVenta"),
    @NamedQuery(name = "OrdenVentas.findByTotalVenta", query = "SELECT o FROM OrdenVentas o WHERE o.totalVenta = :totalVenta"),
    @NamedQuery(name = "OrdenVentas.findByDomicilio", query = "SELECT o FROM OrdenVentas o WHERE o.domicilio = :domicilio")})
public class OrdenVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorden_venta")
    private Integer idordenVenta;
    @Column(name = "fecha_venta")
    @Temporal(TemporalType.DATE)
    private Date fechaVenta;
    @Column(name = "total_venta")
    private Long totalVenta;
    @Column(name = "domicilio")
    private Short domicilio;
    @JoinColumn(name = "cliente_idcliente", referencedColumnName = "idcliente")
    @ManyToOne(fetch = FetchType.LAZY)
    private Clientes clienteIdcliente;
    @JoinColumn(name = "persona_idpersona", referencedColumnName = "idpersona")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personas personaIdpersona;
    @OneToMany(mappedBy = "ordenVentaIdordenVenta", fetch = FetchType.LAZY)
    private List<DetalleOrdenVentas> detalleOrdenVentasList;
    @OneToMany(mappedBy = "ordenventaId", fetch = FetchType.LAZY)
    private List<Novedades> novedadesList;

    public OrdenVentas() {
    }

    public OrdenVentas(Integer idordenVenta) {
        this.idordenVenta = idordenVenta;
    }

    public Integer getIdordenVenta() {
        return idordenVenta;
    }

    public void setIdordenVenta(Integer idordenVenta) {
        this.idordenVenta = idordenVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Long getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Long totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Short getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Short domicilio) {
        this.domicilio = domicilio;
    }

    public Clientes getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(Clientes clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    public Personas getPersonaIdpersona() {
        return personaIdpersona;
    }

    public void setPersonaIdpersona(Personas personaIdpersona) {
        this.personaIdpersona = personaIdpersona;
    }

    @XmlTransient
    public List<DetalleOrdenVentas> getDetalleOrdenVentasList() {
        return detalleOrdenVentasList;
    }

    public void setDetalleOrdenVentasList(List<DetalleOrdenVentas> detalleOrdenVentasList) {
        this.detalleOrdenVentasList = detalleOrdenVentasList;
    }

    @XmlTransient
    public List<Novedades> getNovedadesList() {
        return novedadesList;
    }

    public void setNovedadesList(List<Novedades> novedadesList) {
        this.novedadesList = novedadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idordenVenta != null ? idordenVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenVentas)) {
            return false;
        }
        OrdenVentas other = (OrdenVentas) object;
        if ((this.idordenVenta == null && other.idordenVenta != null) || (this.idordenVenta != null && !this.idordenVenta.equals(other.idordenVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.systemt.model.entities.OrdenVentas[ idordenVenta=" + idordenVenta + " ]";
    }
    
}
