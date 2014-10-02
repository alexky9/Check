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
@Table(name = "datos_equipo")
@NamedQueries({
    @NamedQuery(name = "DatosEquipo.findAll", query = "SELECT d FROM DatosEquipo d")})
public class DatosEquipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_datos_eq")
    private Integer iddatoseq;
    @Size(max = 50)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 40)
    @Column(name = "ram")
    private String ram;
    @Size(max = 30)
    @Column(name = "hd")
    private String hd;
    @Size(max = 30)
    @Column(name = "procesador")
    private String procesador;
    @Size(max = 20)
    @Column(name = "so")
    private String so;
    @Size(max = 30)
    @Column(name = "serie")
    private String serie;
    @Size(max = 30)
    @Column(name = "otro")
    private String otro;
    @OneToMany(mappedBy = "datosEquipo")
    private List<Equipo> equipoList;

    public DatosEquipo() {
    }

    public DatosEquipo(Integer iddatoseq, String modelo, String ram, String hd, String procesador, String so, String serie, String otro, List<Equipo> equipoList) {
        this.iddatoseq = iddatoseq;
        this.modelo = modelo;
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
        this.so = so;
        this.serie = serie;
        this.otro = otro;
        this.equipoList = equipoList;
    }

    public DatosEquipo(Integer iddatoseq) {
        this.iddatoseq = iddatoseq;
    }

    public Integer getIddatoseq() {
        return iddatoseq;
    }

    public void setIddatoseq(Integer iddatoseq) {
        this.iddatoseq = iddatoseq;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
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
        hash += (iddatoseq != null ? iddatoseq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosEquipo)) {
            return false;
        }
        DatosEquipo other = (DatosEquipo) object;
        if ((this.iddatoseq == null && other.iddatoseq != null) || (this.iddatoseq != null && !this.iddatoseq.equals(other.iddatoseq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.barmex.checklist.DatosEquipo[ iddatoseq=" + iddatoseq + " ]";
    }
    
}
