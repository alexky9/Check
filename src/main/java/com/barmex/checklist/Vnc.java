
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

@Entity
@Table(name = "vnc")
@NamedQueries({
    @NamedQuery(name = "Vnc.findAll", query = "SELECT v FROM Vnc v")})
public class Vnc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_vnc")
    private Integer idvnc;
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 10)
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(mappedBy = "vnc")
    private List<Equipo> equipoList;

    public Vnc() {
    }

    public Vnc(Integer idvnc, String nombre, String tipo, List<Equipo> equipoList) {
        this.idvnc = idvnc;
        this.nombre = nombre;
        this.tipo = tipo;
        this.equipoList = equipoList;
    }

    public Vnc(Integer idvnc) {
        this.idvnc = idvnc;
    }

    public Integer getIdvnc() {
        return idvnc;
    }

    public void setIdvnc(Integer idvnc) {
        this.idvnc = idvnc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        hash += (idvnc != null ? idvnc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vnc)) {
            return false;
        }
        Vnc other = (Vnc) object;
        if ((this.idvnc == null && other.idvnc != null) || (this.idvnc != null && !this.idvnc.equals(other.idvnc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.barmex.checklist.Vnc[ idvnc=" + idvnc + " ]";
    }
    
}
