
package com.barmex.checklist;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "agregado")
@NamedQueries({
    @NamedQuery(name = "Agregado.findAll", query = "SELECT a FROM Agregado a")})
public class Agregado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_agregado")
    private Integer idagregado;
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;

    public Agregado() {
    }

    public Agregado(Integer idagregado, String nombre) {
        this.idagregado = idagregado;
        this.nombre = nombre;
    }

    public Agregado(Integer idagregado) {
        this.idagregado = idagregado;
    }

    public Integer getIdagregado() {
        return idagregado;
    }

    public void setIdagregado(Integer idagregado) {
        this.idagregado = idagregado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idagregado != null ? idagregado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agregado)) {
            return false;
        }
        Agregado other = (Agregado) object;
        if ((this.idagregado == null && other.idagregado != null) || (this.idagregado != null && !this.idagregado.equals(other.idagregado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.barmex.checklist.Agregado[ idagregado=" + idagregado + " ]";
    }
    
}
