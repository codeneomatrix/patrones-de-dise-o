/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.util.ArrayList;

/**
 *
 * @author Neomatrix
 */
public class mostrarcondicionesactuales implements observador, mostrarelemento{
    private float dato;
    private String aspect;
    private String minombre;
    private sujeto datosclimaticos;
    
    mostrarcondicionesactuales(sujeto datosclimaticos,String[] aspecto,String nombre){
        this.datosclimaticos= datosclimaticos;
        this.minombre=nombre;
        datosclimaticos.registrarobservador(this,aspecto);
    }
    
    public void actualiza( String dato,float aspecto){
        this.dato = aspecto;
        this.aspect= dato;
        mostrar();
    }
    
    public void mostrar(){
        System.out.print(""+minombre+"::"+aspect+": "+dato+"\n");
    }
}

