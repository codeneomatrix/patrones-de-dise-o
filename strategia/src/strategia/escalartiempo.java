/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strategia;

/**
 *
 * @author acer
 */
public class escalartiempo implements modoescalar{
    private datocompuesto e;
    escalartiempo(datocompuesto yo){
     e=yo;   
    }
    
    @Override
     public datocompuesto escala(int escala){
       if(escala>0){
        int h= (int)(e.dato1());
        int m= (int)(e.dato2());
        
        h=h+escala;
        
        if(h>=24){
            h=h-24;
        }
        
        tiempo r= new tiempo(h,m);
        return r;
       }
       if(escala<0){
           int h= (int)(e.dato1());
        int m= (int)(e.dato2());
        
        h=h+escala;
        
        if(h<0){
            h=24+h;
        }
        if(h<0){
            h=24+h;
        }
        
        tiempo r= new tiempo(h,m);
        return r;
        }
       
       tiempo r= new tiempo(0,0);
        return r;
    }
}
