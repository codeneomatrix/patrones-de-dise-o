/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.tutoria.modelo;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "MATERIA_CARRERA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MateriaCarrera.findAll", query = "SELECT m FROM MateriaCarrera m"),
    @NamedQuery(name = "MateriaCarrera.findByIdcm", query = "SELECT m FROM MateriaCarrera m WHERE m.idcm = :idcm"),
    @NamedQuery(name = "MateriaCarrera.findByIdcarr", query = "SELECT m FROM MateriaCarrera m WHERE m.idcarr = :idcarr"),
    @NamedQuery(name = "MateriaCarrera.findByIdmat", query = "SELECT m FROM MateriaCarrera m WHERE m.idmat = :idmat"),
    @NamedQuery(name = "MateriaCarrera.findBySemestre", query = "SELECT m FROM MateriaCarrera m WHERE m.semestre = :semestre")})
public class MateriaCarrera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCM")
    public Integer idcm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCARR")
    public int idcarr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMAT")
    public int idmat;
    @Size(max = 50)
    @Column(name = "SEMESTRE")
    public String semestre;

    public MateriaCarrera() {
    }

    public MateriaCarrera(Integer idcm) {
        this.idcm = idcm;
    }

    public MateriaCarrera(Integer idcm, int idcarr, int idmat) {
        this.idcm = idcm;
        this.idcarr = idcarr;
        this.idmat = idmat;
    }

    public Integer getIdcm() {
        return idcm;
    }

    public void setIdcm(Integer idcm) {
        this.idcm = idcm;
    }

    public int getIdcarr() {
        return idcarr;
    }

    public void setIdcarr(int idcarr) {
        this.idcarr = idcarr;
    }

    public int getIdmat() {
        return idmat;
    }

    public void setIdmat(int idmat) {
        this.idmat = idmat;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcm != null ? idcm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriaCarrera)) {
            return false;
        }
        MateriaCarrera other = (MateriaCarrera) object;
        if ((this.idcm == null && other.idcm != null) || (this.idcm != null && !this.idcm.equals(other.idcm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.itoaxaca.tutoria.modelo.MateriaCarrera[ idcm=" + idcm + " ]";
    }
    
}
