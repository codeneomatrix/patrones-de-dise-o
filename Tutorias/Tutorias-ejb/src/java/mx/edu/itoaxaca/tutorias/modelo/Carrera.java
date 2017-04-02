/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.tutorias.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "CARRERA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrera.findAll", query = "SELECT c FROM Carrera c"),
    @NamedQuery(name = "Carrera.findByIdcarrera", query = "SELECT c FROM Carrera c WHERE c.idcarrera = :idcarrera"),
    @NamedQuery(name = "Carrera.findByNombre", query = "SELECT c FROM Carrera c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Carrera.findByCreditos", query = "SELECT c FROM Carrera c WHERE c.creditos = :creditos")})
public class Carrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCARRERA")
    private Integer idcarrera;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREDITOS")
    private int creditos;

    public Carrera() {
    }

    public Carrera(Integer idcarrera) {
        this.idcarrera = idcarrera;
    }

    public Carrera(Integer idcarrera, String nombre, int creditos) {
        this.idcarrera = idcarrera;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public Integer getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(Integer idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcarrera != null ? idcarrera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrera)) {
            return false;
        }
        Carrera other = (Carrera) object;
        if ((this.idcarrera == null && other.idcarrera != null) || (this.idcarrera != null && !this.idcarrera.equals(other.idcarrera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.itoaxaca.tutorias.modelo.Carrera[ idcarrera=" + idcarrera + " ]";
    }
    
}
