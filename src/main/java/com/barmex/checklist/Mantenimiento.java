
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
@Table(name = "mantenimiento")
@NamedQueries({
    @NamedQuery(name = "Mantenimiento.findAll", query = "SELECT m FROM Mantenimiento m")})
public class Mantenimiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_mantenimiento")
    private Integer idmantenimiento;
    @Size(max = 4)
    @Column(name = "limpiar")
    private String limpiar;
    @Size(max = 4)
    @Column(name = "empacar")
    private String empacar;
    @Size(max = 4)
    @Column(name = "cargador")
    private String cargador;
    @Size(max = 4)
    @Column(name = "etiqueta")
    private String etiqueta;
    @OneToMany(mappedBy = "mantenimiento")
    private List<Equipos> equiposList;

    public Mantenimiento() {
    }

    public Mantenimiento(Integer idmantenimiento, String limpiar, String empacar, String cargador, String etiqueta, List<Equipos> equiposList) {
        this.idmantenimiento = idmantenimiento;
        this.limpiar = limpiar;
        this.empacar = empacar;
        this.cargador = cargador;
        this.etiqueta = etiqueta;
        this.equiposList = equiposList;
    }

    public Mantenimiento(Integer idmantenimiento) {
        this.idmantenimiento = idmantenimiento;
    }

    public Integer getIdmantenimiento() {
        return idmantenimiento;
    }

    public void setIdmantenimiento(Integer idmantenimiento) {
        this.idmantenimiento = idmantenimiento;
    }

    public String getLimpiar() {
        return limpiar;
    }

    public void setLimpiar(String limpiar) {
        this.limpiar = limpiar;
    }

    public String getEmpacar() {
        return empacar;
    }

    public void setEmpacar(String empacar) {
        this.empacar = empacar;
    }

    public String getCargador() {
        return cargador;
    }

    public void setCargador(String cargador) {
        this.cargador = cargador;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public List<Equipos> getEquiposList() {
        return equiposList;
    }

    public void setEquiposList(List<Equipos> equiposList) {
        this.equiposList = equiposList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmantenimiento != null ? idmantenimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mantenimiento)) {
            return false;
        }
        Mantenimiento other = (Mantenimiento) object;
        if ((this.idmantenimiento == null && other.idmantenimiento != null) || (this.idmantenimiento != null && !this.idmantenimiento.equals(other.idmantenimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.barmex.checklist.Mantenimiento[ idmantenimiento=" + idmantenimiento + " ]";
    }
    
}
