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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author natalia
 */
@Entity
@Table(name = "orden_entregas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenEntregas.findAll", query = "SELECT o FROM OrdenEntregas o"),
    @NamedQuery(name = "OrdenEntregas.findByIdordenEntrega", query = "SELECT o FROM OrdenEntregas o WHERE o.idordenEntrega = :idordenEntrega"),
    @NamedQuery(name = "OrdenEntregas.findByFechaEntrega", query = "SELECT o FROM OrdenEntregas o WHERE o.fechaEntrega = :fechaEntrega"),
    @NamedQuery(name = "OrdenEntregas.findByCantidad", query = "SELECT o FROM OrdenEntregas o WHERE o.cantidad = :cantidad"),
    @NamedQuery(name = "OrdenEntregas.findByEstadoEnvio", query = "SELECT o FROM OrdenEntregas o WHERE o.estadoEnvio = :estadoEnvio")})
public class OrdenEntregas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorden_entrega")
    private Integer idordenEntrega;
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Size(max = 45)
    @Column(name = "cantidad")
    private String cantidad;
    @Size(max = 45)
    @Column(name = "estado_envio")
    private String estadoEnvio;
    @JoinColumn(name = "cliente_idcliente", referencedColumnName = "idcliente")
    @ManyToOne(fetch = FetchType.LAZY)
    private Clientes clienteIdcliente;
    @JoinColumn(name = "detalleordenventa_id", referencedColumnName = "iddetalle_orden_venta")
    @ManyToOne(fetch = FetchType.LAZY)
    private DetalleOrdenVentas detalleordenventaId;
    @OneToMany(mappedBy = "ordenentregaId", fetch = FetchType.LAZY)
    private List<Novedades> novedadesList;

    public OrdenEntregas() {
    }

    public OrdenEntregas(Integer idordenEntrega) {
        this.idordenEntrega = idordenEntrega;
    }

    public Integer getIdordenEntrega() {
        return idordenEntrega;
    }

    public void setIdordenEntrega(Integer idordenEntrega) {
        this.idordenEntrega = idordenEntrega;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public Clientes getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(Clientes clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    public DetalleOrdenVentas getDetalleordenventaId() {
        return detalleordenventaId;
    }

    public void setDetalleordenventaId(DetalleOrdenVentas detalleordenventaId) {
        this.detalleordenventaId = detalleordenventaId;
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
        hash += (idordenEntrega != null ? idordenEntrega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenEntregas)) {
            return false;
        }
        OrdenEntregas other = (OrdenEntregas) object;
        if ((this.idordenEntrega == null && other.idordenEntrega != null) || (this.idordenEntrega != null && !this.idordenEntrega.equals(other.idordenEntrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.systemt.model.entities.OrdenEntregas[ idordenEntrega=" + idordenEntrega + " ]";
    }
    
}
