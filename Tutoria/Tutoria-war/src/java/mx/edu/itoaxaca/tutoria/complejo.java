/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.tutoria;

import mx.edu.itoaxaca.tutoria.modelo.Materia;

/**
 *
 * @author acer
 */
public class complejo implements Comparable<complejo>{
    private Materia mat;
    private int semestre;
    
    complejo(Materia m,int sem){
        mat=m;
        semestre=sem;
    }

    public Materia getMat() {
        return mat;
    }

    public void setMat(Materia mat) {
        this.mat = mat;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public int compareTo(complejo o) {
        int b= ((complejo)o).getSemestre();
        //ascendente
        return this.getSemestre()-b;
        //descendente
        //return b-this.getSemestre();
    }
    
    
}
