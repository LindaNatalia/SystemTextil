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
@Table(name = "personas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p"),
    @NamedQuery(name = "Personas.findByIdpersona", query = "SELECT p FROM Personas p WHERE p.idpersona = :idpersona"),
    @NamedQuery(name = "Personas.findByTipoDocumento", query = "SELECT p FROM Personas p WHERE p.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Personas.findByNumeroDocumento", query = "SELECT p FROM Personas p WHERE p.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "Personas.findByNombre", query = "SELECT p FROM Personas p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Personas.findByApellido", query = "SELECT p FROM Personas p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Personas.findByBarrio", query = "SELECT p FROM Personas p WHERE p.barrio = :barrio"),
    @NamedQuery(name = "Personas.findByDireccion", query = "SELECT p FROM Personas p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Personas.findByTelefono", query = "SELECT p FROM Personas p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Personas.findByCorreo", query = "SELECT p FROM Personas p WHERE p.correo = :correo"),
    @NamedQuery(name = "Personas.findByClave", query = "SELECT p FROM Personas p WHERE p.clave = :clave")})
public class Personas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpersona")
    private Integer idpersona;
    @Size(max = 45)
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Size(max = 25)
    @Column(name = "numero_documento")
    private String numeroDocumento;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 45)
    @Column(name = "barrio")
    private String barrio;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 45)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 45)
    @Column(name = "correo")
    private String correo;
    @Size(max = 45)
    @Column(name = "clave")
    private String clave;
    @OneToMany(mappedBy = "personaIdpersona", fetch = FetchType.LAZY)
    private List<OrdenVentas> ordenVentasList;
    @JoinColumn(name = "estado_idestado", referencedColumnName = "idestado")
    @ManyToOne(fetch = FetchType.LAZY)
    private Estados estadoIdestado;
    @JoinColumn(name = "rol_idrol", referencedColumnName = "idrol")
    @ManyToOne(fetch = FetchType.LAZY)
    private Roles rolIdrol;
    @OneToMany(mappedBy = "personaIdpersona", fetch = FetchType.LAZY)
    private List<Proveedores> proveedoresList;
    @OneToMany(mappedBy = "personaIdpersona", fetch = FetchType.LAZY)
    private List<OrdenCompras> ordenComprasList;
    @OneToMany(mappedBy = "clienteIdpersona", fetch = FetchType.LAZY)
    private List<Clientes> clientesList;

    public Personas() {
    }

    public Personas(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @XmlTransient
    public List<OrdenVentas> getOrdenVentasList() {
        return ordenVentasList;
    }

    public void setOrdenVentasList(List<OrdenVentas> ordenVentasList) {
        this.ordenVentasList = ordenVentasList;
    }

    public Estados getEstadoIdestado() {
        return estadoIdestado;
    }

    public void setEstadoIdestado(Estados estadoIdestado) {
        this.estadoIdestado = estadoIdestado;
    }

    public Roles getRolIdrol() {
        return rolIdrol;
    }

    public void setRolIdrol(Roles rolIdrol) {
        this.rolIdrol = rolIdrol;
    }

    @XmlTransient
    public List<Proveedores> getProveedoresList() {
        return proveedoresList;
    }

    public void setProveedoresList(List<Proveedores> proveedoresList) {
        this.proveedoresList = proveedoresList;
    }

    @XmlTransient
    public List<OrdenCompras> getOrdenComprasList() {
        return ordenComprasList;
    }

    public void setOrdenComprasList(List<OrdenCompras> ordenComprasList) {
        this.ordenComprasList = ordenComprasList;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersona != null ? idpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.idpersona == null && other.idpersona != null) || (this.idpersona != null && !this.idpersona.equals(other.idpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.systemt.model.entities.Personas[ idpersona=" + idpersona + " ]";
    }
    
}
