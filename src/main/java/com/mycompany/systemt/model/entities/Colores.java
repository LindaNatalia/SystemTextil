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
@Table(name = "colores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colores.findAll", query = "SELECT c FROM Colores c"),
    @NamedQuery(name = "Colores.findByIdcolor", query = "SELECT c FROM Colores c WHERE c.idcolor = :idcolor"),
    @NamedQuery(name = "Colores.findByNombreColor", query = "SELECT c FROM Colores c WHERE c.nombreColor = :nombreColor")})
public class Colores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcolor")
    private Integer idcolor;
    @Size(max = 45)
    @Column(name = "nombre_color")
    private String nombreColor;
    @OneToMany(mappedBy = "colorIdcolor", fetch = FetchType.LAZY)
    private List<Productos> productosList;

    public Colores() {
    }

    public Colores(Integer idcolor) {
        this.idcolor = idcolor;
    }

    public Integer getIdcolor() {
        return idcolor;
    }

    public void setIdcolor(Integer idcolor) {
        this.idcolor = idcolor;
    }

    public String getNombreColor() {
        return nombreColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }

    @XmlTransient
    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcolor != null ? idcolor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colores)) {
            return false;
        }
        Colores other = (Colores) object;
        if ((this.idcolor == null && other.idcolor != null) || (this.idcolor != null && !this.idcolor.equals(other.idcolor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.systemt.model.entities.Colores[ idcolor=" + idcolor + " ]";
    }
    
}
