/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.tutoria.ln;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import mx.edu.itoaxaca.tutoria.dao.CarreraFacade;
import mx.edu.itoaxaca.tutoria.modelo.Carrera;

/**
 *
 * @author acer
 */
@Stateless
@LocalBean
public class TutoriaLn {
    @EJB
    private CarreraFacade carreraF;
    //private Carrera carrera;
    
    public void crear(Carrera c){
        carreraF.create(c);
    }
    public int numReg(){
        return carreraF.count();
    }
    public List<Carrera> carreras(){
        return carreraF.findAll();
    }
    public int ulti(){
        if(carreraF.findAll().size()==0){
            return 0;
        }
        return carreraF.findAll().get(carreraF.findAll().size()-1).idcarrera;    
    }
    public Carrera busca(int k){
        return carreraF.find(k);
    }
    
    public void borra(Carrera c){
        carreraF.remove(c);
    }
    public void edita(Carrera c){
        carreraF.edit(c);
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
