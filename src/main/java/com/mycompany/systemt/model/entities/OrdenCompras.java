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
@Table(name = "orden_compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenCompras.findAll", query = "SELECT o FROM OrdenCompras o"),
    @NamedQuery(name = "OrdenCompras.findByIdordenCompra", query = "SELECT o FROM OrdenCompras o WHERE o.idordenCompra = :idordenCompra"),
    @NamedQuery(name = "OrdenCompras.findByFechaCompra", query = "SELECT o FROM OrdenCompras o WHERE o.fechaCompra = :fechaCompra"),
    @NamedQuery(name = "OrdenCompras.findByTotalCompra", query = "SELECT o FROM OrdenCompras o WHERE o.totalCompra = :totalCompra")})
public class OrdenCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorden_compra")
    private Integer idordenCompra;
    @Column(name = "fecha_compra")
    @Temporal(TemporalType.DATE)
    private Date fechaCompra;
    @Column(name = "total_compra")
    private Long totalCompra;
    @OneToMany(mappedBy = "ordencompraId", fetch = FetchType.LAZY)
    private List<Novedades> novedadesList;
    @OneToMany(mappedBy = "ordenCompraIdordenCompra", fetch = FetchType.LAZY)
    private List<DetalleOrdenCompras> detalleOrdenComprasList;
    @JoinColumn(name = "persona_idpersona", referencedColumnName = "idpersona")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personas personaIdpersona;
    @JoinColumn(name = "proveedor_idproveedor", referencedColumnName = "idproveedor")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedores proveedorIdproveedor;

    public OrdenCompras() {
    }

    public OrdenCompras(Integer idordenCompra) {
        this.idordenCompra = idordenCompra;
    }

    public Integer getIdordenCompra() {
        return idordenCompra;
    }

    public void setIdordenCompra(Integer idordenCompra) {
        this.idordenCompra = idordenCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Long getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Long totalCompra) {
        this.totalCompra = totalCompra;
    }

    @XmlTransient
    public List<Novedades> getNovedadesList() {
        return novedadesList;
    }

    public void setNovedadesList(List<Novedades> novedadesList) {
        this.novedadesList = novedadesList;
    }

    @XmlTransient
    public List<DetalleOrdenCompras> getDetalleOrdenComprasList() {
        return detalleOrdenComprasList;
    }

    public void setDetalleOrdenComprasList(List<DetalleOrdenCompras> detalleOrdenComprasList) {
        this.detalleOrdenComprasList = detalleOrdenComprasList;
    }

    public Personas getPersonaIdpersona() {
        return personaIdpersona;
    }

    public void setPersonaIdpersona(Personas personaIdpersona) {
        this.personaIdpersona = personaIdpersona;
    }

    public Proveedores getProveedorIdproveedor() {
        return proveedorIdproveedor;
    }

    public void setProveedorIdproveedor(Proveedores proveedorIdproveedor) {
        this.proveedorIdproveedor = proveedorIdproveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idordenCompra != null ? idordenCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenCompras)) {
            return false;
        }
        OrdenCompras other = (OrdenCompras) object;
        if ((this.idordenCompra == null && other.idordenCompra != null) || (this.idordenCompra != null && !this.idordenCompra.equals(other.idordenCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.systemt.model.entities.OrdenCompras[ idordenCompra=" + idordenCompra + " ]";
    }
    
}
