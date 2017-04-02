/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.tutoria;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import mx.edu.itoaxaca.tutoria.ln.TutoriaLn;
import mx.edu.itoaxaca.tutoria.modelo.Carrera;

/**
 *
 * @author acer
 */
@Named(value = "tutoriasAdm")
@SessionScoped
public class TutoriasAdm implements Serializable {
    private List<Carrera> carreras;
    private int idc;
    
    String variable;
    int minimo=120;
    int maximo=300;
    
    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }
    @EJB
    private TutoriaLn tutoriaLn;
    private Carrera carrera;

    public int getMinimo() {
        return minimo;
    }

    public int getMaximo() {
        return maximo;
    }
    
    
    
    public TutoriasAdm() {
        carreras = new ArrayList<Carrera>();
    }
    public void crearCarrera(ActionEvent e){
        carrera = new Carrera();
    }
    
    
    
    public TutoriaLn getTutoriaLn() {
        return tutoriaLn;
    }

    public void setTutoriaLn(TutoriaLn tutoriaLn) {
        this.tutoriaLn = tutoriaLn;
    }
    
    
    public void agregarCarrera(ActionEvent e){
        List<Carrera> lista= tutoriaLn.carreras();
        Boolean encontrado=false;
        
        for(Carrera l: lista){
            
            if(l.getNombre().equals(carrera.getNombre()) ){    
                encontrado=true;
            }
        }
        if(encontrado){
            variable="carrerarepetida";
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Carrera repetida"));
        }else{
            
            tutoriaLn.crear(carrera);
            variable="carrera";
        }
    }
    
    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }
     public void carreras(ActionEvent e){
        carreras = tutoriaLn.carreras();
    }
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    public List<Carrera> lista(){
        return tutoriaLn.carreras();
    }
    
    public int ultimo(){
        return tutoriaLn.ulti()+1;
    }
    
    public void buscar(ActionEvent e){
        Carrera c;
        c=tutoriaLn.busca(carrera.idcarrera);
        if(c!=null){
           carrera=c; 
        }else{
            carrera=new Carrera();
        }
        
    }
    
    public void borrar(ActionEvent e){
        Carrera c;
        c=tutoriaLn.busca(carrera.idcarrera);
        if(c!=null){
            carrera=c;
            tutoriaLn.borra(c);
        }else{
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Id sin asignar"));
        }
        
    }

    public String getVariable() {
        return variable;
    }
    
    
    
    public void editar(ActionEvent e){
            tutoriaLn.edita(carrera);
    }
    
    

}
