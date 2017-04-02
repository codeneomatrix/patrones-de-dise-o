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
import mx.edu.itoaxaca.tutoria.dao.MateriaFacade;
import mx.edu.itoaxaca.tutoria.modelo.Materia;

/**
 *
 * @author acer
 */
@Stateless
@LocalBean
public class MateriaLn {
    @EJB
    private MateriaFacade materiaF;
    
    public void crear(Materia c){
        materiaF.create(c);
    }
    public int numReg(){
        return materiaF.count();
    }
    public List<Materia> materias(){
        return materiaF.findAll();
    }
     public int ulti(){
         if(materiaF.findAll().size()==0){
            return 0;
        }
        return materiaF.findAll().get(materiaF.findAll().size()-1).idmateria;    
    }
    public Materia busca(int k){
        return materiaF.find(k);
    }
    
    public void borra(Materia c){
        materiaF.remove(c);
    }
    public void edita(Materia c){
        materiaF.edit(c);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
