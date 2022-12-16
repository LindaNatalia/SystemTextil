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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author natalia
 */
@Entity
@Table(name = "clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByIdcliente", query = "SELECT c FROM Clientes c WHERE c.idcliente = :idcliente")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcliente")
    private Integer idcliente;
    @OneToMany(mappedBy = "clienteIdcliente", fetch = FetchType.LAZY)
    private List<OrdenVentas> ordenVentasList;
    @OneToMany(mappedBy = "clienteIdcliente", fetch = FetchType.LAZY)
    private List<OrdenEntregas> ordenEntregasList;
    @JoinColumn(name = "cliente_idpersona", referencedColumnName = "idpersona")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personas clienteIdpersona;

    public Clientes() {
    }

    public Clientes(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    @XmlTransient
    public List<OrdenVentas> getOrdenVentasList() {
        return ordenVentasList;
    }

    public void setOrdenVentasList(List<OrdenVentas> ordenVentasList) {
        this.ordenVentasList = ordenVentasList;
    }

    @XmlTransient
    public List<OrdenEntregas> getOrdenEntregasList() {
        return ordenEntregasList;
    }

    public void setOrdenEntregasList(List<OrdenEntregas> ordenEntregasList) {
        this.ordenEntregasList = ordenEntregasList;
    }

    public Personas getClienteIdpersona() {
        return clienteIdpersona;
    }

    public void setClienteIdpersona(Personas clienteIdpersona) {
        this.clienteIdpersona = clienteIdpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcliente != null ? idcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idcliente == null && other.idcliente != null) || (this.idcliente != null && !this.idcliente.equals(other.idcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.systemt.model.entities.Clientes[ idcliente=" + idcliente + " ]";
    }
    
}
