
package barmex;

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
@Table(name = "equipo")
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e")})
public class Equipo implements Serializable {
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
    @Size(max = 30)
    @Column(name = "productkey")
    private String productkey;
    @JoinColumn(name = "Id_datos_eq", referencedColumnName = "Id_datos_eq")
    @ManyToOne
    private DatosEquipo datosEquipo;
    @JoinColumn(name = "Id_datos_en", referencedColumnName = "Id_datos_en")
    @ManyToOne
    private DatosEnvio datosEnvio;
    @JoinColumn(name = "Id_programa", referencedColumnName = "Id_programa")
    @ManyToOne
    private Programa programa;
    @JoinColumn(name = "Id_configuracion", referencedColumnName = "Id_configuracion")
    @ManyToOne
    private Configuraciones configuraciones;
    @JoinColumn(name = "Id_mantenimiento", referencedColumnName = "Id_mantenimiento")
    @ManyToOne
    private Mantenimiento mantenimiento;
    @JoinColumn(name = "Id_factur", referencedColumnName = "Id_factur")
    @ManyToOne
    private Factur factur;
    @JoinColumn(name = "Id_vnc", referencedColumnName = "Id_vnc")
    @ManyToOne
    private Vnc vnc;
    @JoinColumn(name = "Id_agregado", referencedColumnName = "Id_agregado")
    @ManyToOne
    private Agregado agregado;

    public Equipo() {
    }

    public Equipo(Integer idequipo, String nombre, String asignacion, String caracteristica, String tipo, String sucof, String comentario, String respaldos, String contraseña, String productkey, DatosEquipo datosEquipo, DatosEnvio datosEnvio, Programa programa, Configuraciones configuraciones, Mantenimiento mantenimiento, Factur factur, Vnc vnc, Agregado agregado) {
        this.idequipo = idequipo;
        this.nombre = nombre;
        this.asignacion = asignacion;
        this.caracteristica = caracteristica;
        this.tipo = tipo;
        this.sucof = sucof;
        this.comentario = comentario;
        this.respaldos = respaldos;
        this.contraseña = contraseña;
        this.productkey = productkey;
        this.datosEquipo = datosEquipo;
        this.datosEnvio = datosEnvio;
        this.programa = programa;
        this.configuraciones = configuraciones;
        this.mantenimiento = mantenimiento;
        this.factur = factur;
        this.vnc = vnc;
        this.agregado = agregado;
    }

    public Equipo(Integer idequipo) {
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

    public String getProductkey() {
        return productkey;
    }

    public void setProductkey(String productkey) {
        this.productkey = productkey;
    }

    public DatosEquipo getDatosEquipo() {
        return datosEquipo;
    }

    public void setDatosEquipo(DatosEquipo datosEquipo) {
        this.datosEquipo = datosEquipo;
    }

    public DatosEnvio getDatosEnvio() {
        return datosEnvio;
    }

    public void setDatosEnvio(DatosEnvio datosEnvio) {
        this.datosEnvio = datosEnvio;
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

    public Factur getFactur() {
        return factur;
    }

    public void setFactur(Factur factur) {
        this.factur = factur;
    }

    public Vnc getVnc() {
        return vnc;
    }

    public void setVnc(Vnc vnc) {
        this.vnc = vnc;
    }

    public Agregado getAgregado() {
        return agregado;
    }

    public void setAgregado(Agregado agregado) {
        this.agregado = agregado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idequipo != null ? idequipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
  
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.idequipo == null && other.idequipo != null) || (this.idequipo != null && !this.idequipo.equals(other.idequipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.barmex.checklist.Equipo[ idequipo=" + idequipo + " ]";
    }
    
}
