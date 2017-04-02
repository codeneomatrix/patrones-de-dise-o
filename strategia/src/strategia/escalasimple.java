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
public class escalasimple implements modoescalar{
    private datocompuesto e;
    escalasimple(datocompuesto yo){
     e=yo;   
    }
    
    @Override
     public datocompuesto escala(int escala){
       if(escala>0){
           vector r= new vector((e.dato1()*escala),e.dato2());
        return r;
       }
       if(escala<0){
           vector r= new vector((e.dato1()/escala),e.dato2());
        return r;
       }
       
       vector r= new vector(0.0,e.dato2());
        return r;
    }
}
