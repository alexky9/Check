
package com.barmex.checklist;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "equipos")
@NamedQueries({
    @NamedQuery(name = "Equipos.findAll", query = "SELECT e FROM Equipos e")})
public class Equipos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_equipo")
    private Integer idequipo;
    @Size(max = 80)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 80)
    @Column(name = "asignacion")
    private String asignacion;
    @Size(max = 15)
    @Column(name = "caracteristica")
    private String caracteristica;
    @Size(max = 15)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 30)
    @Column(name = "sucof")
    private String sucof;
    @Size(max = 100)
    @Column(name = "comentario")
    private String comentario;
    @Size(max = 100)
    @Column(name = "respaldos")
    private String respaldos;
    @Size(max = 25)
    @Column(name = "contraseña")
    private String contraseña;
    @JoinColumn(name = "Id_datos_eq", referencedColumnName = "Id_datos_eq")
    @ManyToOne
    private DatosEquipos datosEquipos;
    @JoinColumn(name = "Id_datos_en", referencedColumnName = "Id_datos_en")
    @ManyToOne
    private DatosEnvios datosEnvios;
    @JoinColumn(name = "Id_programa", referencedColumnName = "Id_programa")
    @ManyToOne
    private Programa programa;
    @JoinColumn(name = "Id_configuracion", referencedColumnName = "Id_configuracion")
    @ManyToOne
    private Configuraciones configuraciones;
    @JoinColumn(name = "Id_mantenimiento", referencedColumnName = "Id_mantenimiento")
    @ManyToOne
    private Mantenimiento mantenimiento;
    @JoinColumn(name = "Id_factura", referencedColumnName = "Id_factura")
    @ManyToOne
    private Facturas facturas;

    public Equipos() {
    }

    public Equipos(Integer idequipo, String nombre, String asignacion, String caracteristica, String tipo, String sucof, String comentario, String respaldos, String contraseña, DatosEquipos datosEquipos, DatosEnvios datosEnvios, Programa programa, Configuraciones configuraciones, Mantenimiento mantenimiento, Facturas facturas) {
        this.idequipo = idequipo;
        this.nombre = nombre;
        this.asignacion = asignacion;
        this.caracteristica = caracteristica;
        this.tipo = tipo;
        this.sucof = sucof;
        this.comentario = comentario;
        this.respaldos = respaldos;
        this.contraseña = contraseña;
        this.datosEquipos = datosEquipos;
        this.datosEnvios = datosEnvios;
        this.programa = programa;
        this.configuraciones = configuraciones;
        this.mantenimiento = mantenimiento;
        this.facturas = facturas;
    }

    public Equipos(Integer idequipo) {
        this.idequipo = idequipo;
    }

    public Integer getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(Integer idequipo) {
        this.idequipo = idequipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(String asignacion) {
        this.asignacion = asignacion;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSucof() {
        return sucof;
    }

    public void setSucof(String sucof) {
        this.sucof = sucof;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getRespaldos() {
        return respaldos;
    }

    public void setRespaldos(String respaldos) {
        this.respaldos = respaldos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public DatosEquipos getDatosEquipos() {
        return datosEquipos;
    }

    public void setDatosEquipos(DatosEquipos datosEquipos) {
        this.datosEquipos = datosEquipos;
    }

    public DatosEnvios getDatosEnvios() {
        return datosEnvios;
    }

    public void setDatosEnvios(DatosEnvios datosEnvios) {
        this.datosEnvios = datosEnvios;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public Configuraciones getConfiguraciones() {
        return configuraciones;
    }

    public void setConfiguraciones(Configuraciones configuraciones) {
        this.configuraciones = configuraciones;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public Facturas getFacturas() {
        return facturas;
    }

    public void setFacturas(Facturas facturas) {
        this.facturas = facturas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idequipo != null ? idequipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipos)) {
            return false;
        }
        Equipos other = (Equipos) object;
        if ((this.idequipo == null && other.idequipo != null) || (this.idequipo != null && !this.idequipo.equals(other.idequipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.barmex.checklist.Equipos[ idequipo=" + idequipo + " ]";
    }
    
}
