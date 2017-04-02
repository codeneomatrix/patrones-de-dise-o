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
public class sumadirecta implements modosumar{
    private datocompuesto e;
    sumadirecta(datocompuesto yo){
     e=yo;   
    }
    
    @Override
    public datocompuesto sumar(datocompuesto otro){
        punto r= new punto((e.dato1()+otro.dato1()),(e.dato2()+otro.dato2()));
        return r;
    }
}
