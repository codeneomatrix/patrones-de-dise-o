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
public class simetricotiempo implements modosimetrico {
    private datocompuesto e;
    simetricotiempo(datocompuesto yo){
     e=yo;   
    }
    
    public void simetrico(){
        int h= (int)(e.dato1());
        int m= (int)(e.dato2());
        
        h=h+12;
        
        if(h>=24){
            h=h-24;
        }
        
        tiempo r= new tiempo(h,m);
        System.out.print(""+r.escribir()+"\n");
    }
    
}
