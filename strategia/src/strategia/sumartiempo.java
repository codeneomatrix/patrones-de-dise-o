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
public class sumartiempo implements modosumar{
    private datocompuesto e;
    sumartiempo(datocompuesto yo){
     e=yo;   
    }
    
    @Override
    public datocompuesto sumar(datocompuesto otro){
        int h= (int)(e.dato1()+otro.dato1());
        int m= (int)(e.dato2()+otro.dato2());
        
        if(m>=60){
            h=h+1;
            m=m-60;
        }
        
        if(h>=24){
            h=h-24;
        }
        
        tiempo r= new tiempo(h,m);
        return r;
    }
    
}
