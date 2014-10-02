/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barmex.checklist;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Alejandro Pacheco
 */
@Entity
@Table(name = "factur")
@NamedQueries({
    @NamedQuery(name = "Factur.findAll", query = "SELECT f FROM Factur f")})
public class Factur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_factur")
    private Integer idfactur;
    @Size(max = 30)
    @Column(name = "factura")
    private String factura;
    @Size(max = 30)
    @Column(name = "Proveedor")
    private String proveedor;
    @Size(max = 20)
    @Column(name = "Precio")
    private String precio;
    @OneToMany(mappedBy = "factur")
    private List<Equipo> equipoList;

    public Factur() {
    }

    public Factur(Integer idfactur, String factura, String proveedor, String precio, List<Equipo> equipoList) {
        this.idfactur = idfactur;
        this.factura = factura;
        this.proveedor = proveedor;
        this.precio = precio;
        this.equipoList = equipoList;
    }

    public Factur(Integer idfactur) {
        this.idfactur = idfactur;
    }

    public Integer getIdfactur() {
        return idfactur;
    }

    public void setIdfactur(Integer idfactur) {
        this.idfactur = idfactur;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfactur != null ? idfactur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factur)) {
            return false;
        }
        Factur other = (Factur) object;
        if ((this.idfactur == null && other.idfactur != null) || (this.idfactur != null && !this.idfactur.equals(other.idfactur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.barmex.checklist.Factur[ idfactur=" + idfactur + " ]";
    }
    
}
