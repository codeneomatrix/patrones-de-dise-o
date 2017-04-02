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
public class simetricopunto implements modosimetrico {
    private datocompuesto e;
    simetricopunto(datocompuesto yo){
     e=yo;   
    }
    
    public void simetrico(){
        System.out.print("("+(e.dato1()*-1)+","+(e.dato2()*-1)+")\n");
    }
    
}
