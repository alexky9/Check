
package com.barmex.checklist;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "datos_envios")
@NamedQueries({
    @NamedQuery(name = "DatosEnvios.findAll", query = "SELECT d FROM DatosEnvios d")})
public class DatosEnvios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_datos_en")
    private Integer iddatosen;
    @Column(name = "fecha_llegada")
    @Temporal(TemporalType.DATE)
    private Date fechaLlegada;
    @Column(name = "fecha_envio")
    @Temporal(TemporalType.DATE)
    private Date fechaEnvio;
    @Column(name = "fecha_recepcion")
    @Temporal(TemporalType.DATE)
    private Date fechaRecepcion;
    @Size(max = 4)
    @Column(name = "correo")
    private String correo;
    @Column(name = "registro")
    @Temporal(TemporalType.DATE)
    private Date registro;
    @OneToMany(mappedBy = "datosEnvios")
    private List<Equipos> equiposList;

    public DatosEnvios() {
    }

    public DatosEnvios(Integer iddatosen, Date fechaLlegada, Date fechaEnvio, Date fechaRecepcion, String correo, Date registro, List<Equipos> equiposList) {
        this.iddatosen = iddatosen;
        this.fechaLlegada = fechaLlegada;
        this.fechaEnvio = fechaEnvio;
        this.fechaRecepcion = fechaRecepcion;
        this.correo = correo;
        this.registro = registro;
        this.equiposList = equiposList;
    }

    public DatosEnvios(Integer iddatosen) {
        this.iddatosen = iddatosen;
    }

    public Integer getIddatosen() {
        return iddatosen;
    }

    public void setIddatosen(Integer iddatosen) {
        this.iddatosen = iddatosen;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
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
        hash += (iddatosen != null ? iddatosen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosEnvios)) {
            return false;
        }
        DatosEnvios other = (DatosEnvios) object;
        if ((this.iddatosen == null && other.iddatosen != null) || (this.iddatosen != null && !this.iddatosen.equals(other.iddatosen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.barmex.checklist.DatosEnvios[ iddatosen=" + iddatosen + " ]";
    }
    
}
