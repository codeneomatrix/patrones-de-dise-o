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
import mx.edu.itoaxaca.tutoria.dao.MateriaCarreraFacade;
import mx.edu.itoaxaca.tutoria.modelo.MateriaCarrera;

/**
 *
 * @author acer
 */
@Stateless
@LocalBean
public class MateriacarreraLn {
    @EJB
    private MateriaCarreraFacade materiaCarreraF;
    
    
    public void crear(MateriaCarrera c){
        materiaCarreraF.create(c);
    }
    public int numReg(){
        return materiaCarreraF.count();
    }
    public List<MateriaCarrera> materiascarreras(){
        return materiaCarreraF.findAll();
    }
    public int ulti(){
        if(materiaCarreraF.findAll().size()==0){
            return 0;
        }
        return materiaCarreraF.findAll().get(materiaCarreraF.findAll().size()-1).idcm;    
    }
    public MateriaCarrera busca(int k){
        return materiaCarreraF.find(k);
    }
    
    public void borra(MateriaCarrera c){
      materiaCarreraF.remove(c);
    }
    public void edita(MateriaCarrera c){
        materiaCarreraF.edit(c);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
