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
import mx.edu.itoaxaca.tutoria.ln.MateriaLn;
import javax.faces.event.ActionEvent;
import mx.edu.itoaxaca.tutoria.modelo.Materia;


/**
 *
 * @author acer
 */
@Named(value = "materiasAmd")
@SessionScoped
public class MateriasAmd implements Serializable {
    
    private List<Materia> materias;
    private int idm;
    String variable;
    int minimo=1;
    int maximo=10;
    @EJB
    private MateriaLn materiaLn;
    private Materia materia;
    //private Option elegido;
    private Object MateriaCarreraAdm;

    public String getVariable() {
        return variable;
    }

    public int getMinimo() {
        return minimo;
    }

    public int getMaximo() {
        return maximo;
    }
    
    
    
    public MateriasAmd() {
        materias = new ArrayList<Materia>();
    }

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }
    
    
    
    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public MateriaLn getMateriaLn() {
        return materiaLn;
    }

    public void setMateriaLn(MateriaLn materiaLn) {
        this.materiaLn = materiaLn;
    }
    public int ultimo(){
        return materiaLn.ulti()+1;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
    
    
    public void crearMateria(ActionEvent e){
        materia = new Materia();
    }

    
    
    
    public void agregarMateria(ActionEvent e){
        
        List<Materia> lista= materiaLn.materias();
        Boolean encontrado=false;
        
        for(Materia l: lista){
            
            if(l.getNombre().equals(materia.getNombre())){    
                encontrado=true;
            }
        }
        if(encontrado){
            variable="carrerarepetida";
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Materia repetida"));
        }else{
            
            materiaLn.crear(materia);
            variable="materia";
        }
        
        
    }
    
    
    public void materias(ActionEvent e){
        materias = materiaLn.materias();
    }
    

   
    public void buscar(ActionEvent e){
        Materia c;
        c=materiaLn.busca(materia.idmateria);
        if(c!=null){
           materia=c; 
        }else{
            materia=new Materia();
        }  
    }
    
   
    
    public void borrar(ActionEvent e){
        Materia c;
        c=materiaLn.busca(materia.idmateria);
        if(c!=null){
            materia=c;
            materiaLn.borra(c);
        }else{
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Id sin asignar"));
        }
    }
    
    public void editar(ActionEvent e){
        materiaLn.edita(materia);
    }
    
}
