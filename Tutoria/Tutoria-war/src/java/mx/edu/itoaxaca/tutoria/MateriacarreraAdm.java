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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import mx.edu.itoaxaca.tutoria.ln.MateriacarreraLn;
import javax.faces.event.ActionEvent;
import mx.edu.itoaxaca.tutoria.ln.MateriaLn;
import mx.edu.itoaxaca.tutoria.ln.TutoriaLn;
import mx.edu.itoaxaca.tutoria.modelo.Carrera;
import mx.edu.itoaxaca.tutoria.modelo.Materia;
import mx.edu.itoaxaca.tutoria.modelo.MateriaCarrera;


/**
 *
 * @author acer
 */
@Named(value = "materiacarreraAdm")
@SessionScoped
public class MateriacarreraAdm implements Serializable {
    @EJB
    private TutoriaLn tutoriaLn;
    String variable;
    int semestreminimo=1;
    int semestremaximo=9;
    @EJB
    private MateriaLn materiaLn;
    private List<MateriaCarrera> materiacarreras;
    @EJB
    private MateriacarreraLn materiacarreraLn;
    
    private MateriaCarrera materiaCarrera;

    public String getVariable() {
        return variable;
    }

    public int getSemestreminimo() {
        return semestreminimo;
    }

    public int getSemestremaximo() {
        return semestremaximo;
    }
    
    
    
    public MateriacarreraAdm() {
        materiacarreras = new ArrayList<MateriaCarrera>();
    }
    
    public void crearMateriaCarrera(ActionEvent e){
        materiaCarrera = new MateriaCarrera();
    }

    public List<MateriaCarrera> getMateriacarreras() {
        return materiacarreras;
    }

    public void setMateriacarreras(List<MateriaCarrera> materiacarreras) {
        this.materiacarreras = materiacarreras;
    }
    
   

    public MateriacarreraLn getMateriacarreraLn() {
        return materiacarreraLn;
    }

    public void setMateriacarreraLn(MateriacarreraLn materiacarreraLn) {
        this.materiacarreraLn = materiacarreraLn;
    }

    public MateriaCarrera getMateriaCarrera() {
        return materiaCarrera;
    }

    public void setMateriaCarrera(MateriaCarrera materiaCarrera) {
        this.materiaCarrera = materiaCarrera;
    }
    
    public void materiacarreras(ActionEvent e){
        materiacarreras = materiacarreraLn.materiascarreras();
    }
    
    public void agregarMateriacarrera(ActionEvent e){
        List<Carrera> cr= tutoriaLn.carreras();
        List<MateriaCarrera> mc = materiacarreraLn.materiascarreras();
        List<Materia> s = new ArrayList<Materia>();
        Iterator<Materia> im;
        //List<Materia> sa = new ArrayList<Materia>();
        int vt=0;
        
        if(materiaCarrera.idcarr!=0){
        s = materiaLn.materias();
        boolean si=false;
        for(MateriaCarrera l : mc){
          if(l.idcarr==materiaCarrera.idcarr){
                //System.out.println("idcarr : "+materiaCarrera.idcarr);
                im= s.iterator();
                while(im.hasNext()){
                    Materia p = im.next();
                    if(l.idmat==p.idmateria){
                        //System.out.println("mre. "+p.getNombre());
                        vt+=p.getCreditos();
                    }
                    if(materiaCarrera.idmat==p.idmateria && si==false){
                        vt+=p.getCreditos();
                        si=true;
                    }
                }        
            }   
        }
        
        
        
        for(Carrera carr: cr){
            if(carr.idcarrera==materiaCarrera.idcarr){
                if(vt>carr.getCreditos()){
                    variable="carrerarepetida";
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("El numero de creditos ha sido rebasado"));
            context.addMessage(null, new FacesMessage("Creditos totales de las materias: "+vt));
            context.addMessage(null, new FacesMessage("Creditos de la materia: "+carr.getCreditos()));
                }else{
                     materiacarreraLn.crear(materiaCarrera);
                     variable="agregarmaterias";
                }
            }
        }
        }
        
        
        
       
    }
     public int ultimo(){
        return materiacarreraLn.ulti()+1;
    }
    
    public void buscar(ActionEvent e){
        MateriaCarrera c;
        c=materiacarreraLn.busca(materiaCarrera.idcm);
        if(c!=null){
           materiaCarrera=c; 
        }else{
            materiaCarrera=new MateriaCarrera();
        }
    }
    
    
     public List<Materia> buscarid(){
        List<MateriaCarrera> mc = materiacarreraLn.materiascarreras();
        List<Materia> s = new ArrayList<Materia>();
        Iterator<Materia> im;
        
        if(materiaCarrera.idcarr!=0){
        s = materiaLn.materias();
        
            for(MateriaCarrera l : mc){
          if(l.idcarr==materiaCarrera.idcarr){
                //System.out.println("idcarr : "+materiaCarrera.idcarr);
                im= s.iterator();
                while(im.hasNext()){
                    Materia p = im.next();
                    
                    if(l.idmat==p.idmateria){
                        //System.out.println("mre. "+p.getNombre());
                        im.remove();
                    }
                }        
            }   
        }
        }
        
        
        return s;
    }
     
     public List<complejo> mostrarmaterias(){
        List<MateriaCarrera> mc = materiacarreraLn.materiascarreras();
        int tan = mc.size();
        List<Materia> s = new ArrayList<Materia>();;
        Iterator<Materia> im;
        List<complejo> sa = new ArrayList<complejo>();
        
        
        if(materiaCarrera.idcarr!=0){
        s = materiaLn.materias();
        
            for(MateriaCarrera l : mc){
          if(l.idcarr==materiaCarrera.idcarr){
                //System.out.println("idcarr : "+materiaCarrera.idcarr);
                im= s.iterator();
                while(im.hasNext()){
                    Materia p = im.next();
                    if(l.idmat==p.idmateria){
                        sa.add(new complejo(p,Integer.parseInt(l.semestre)));
                    }
                }        
            }   
        }
            
           Collections.sort(sa);  
        }
        
        return sa;
    }
     
     
    
     
    public void borrar(ActionEvent e){
        MateriaCarrera c;
        c=materiacarreraLn.busca(materiaCarrera.idcm);
        if(c!=null){
            materiacarreraLn.borra(c);
        }
    }
    
    public void editar(ActionEvent e){
        materiacarreraLn.edita(materiaCarrera);
    }
    
 
    
}
