/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategia;

/**
 *
 * @author Neomatrix
 */
public class escaladoble implements modoescalar{
    private datocompuesto e;
    escaladoble(datocompuesto yo){
     e=yo;   
    }
    
    @Override
     public datocompuesto escala(int escala){
       if(escala>0){
           punto r= new punto((e.dato1()*escala),(e.dato2()*escala));
        return r;
       }
       if(escala<0){
           punto r= new punto((e.dato1()/escala),(e.dato2()/escala));
        return r;
        }
       
       punto r= new punto(0.0,0.0);
        return r;
    }
}
