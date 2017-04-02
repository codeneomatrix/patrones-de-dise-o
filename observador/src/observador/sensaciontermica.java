/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

/**
 *
 * @author Neomatrix
 */
public class sensaciontermica implements observador, mostrarelemento{
    private float temperatura=1.0f;
    private float humedad=1.0f;
    private float sent=1.0f;
    private String aspect;
    private String minombre;
    private sujeto datosclimaticos;
    private float dato;
    
    sensaciontermica(sujeto datosclimaticos,String[] aspecto,String nombre){
        this.datosclimaticos= datosclimaticos;
        this.minombre=nombre;
        datosclimaticos.registrarobservador(this,aspecto);
    }
    
    public void actualiza( String dato,float aspecto){
        this.aspect= dato;
        if(dato=="temperatura"){
           this.temperatura= aspecto*(9/5)+32;

            sent =(float) (-42.379 + 2.04901523 * temperatura+10.14333127 * humedad -0.22475541 * temperatura * humedad+-0.00683783 * Math.pow(temperatura,2)-0.05481717 * Math.pow(humedad,2)+0.001228739 * Math.pow(temperatura,2) * humedad+0.00085282 * temperatura * Math.pow(humedad,2)- 0.00000199*Math.pow(temperatura,2)+Math.pow(humedad,2));
            sent = 5*(sent-32)/9;
        }
        if(dato=="humedad"){
            this.humedad=aspecto;
            sent =(float)(-42.379 + 2.04901523 * temperatura+10.14333127 * humedad -0.22475541 * temperatura * humedad+-0.00683783 * Math.pow(temperatura,2)-0.05481717 * Math.pow(humedad,2)+0.001228739 * Math.pow(temperatura,2) * humedad+0.00085282 * temperatura * Math.pow(humedad,2)- 0.00000199*Math.pow(temperatura,2)+Math.pow(humedad,2));
            sent = 5*(sent-32)/9;
        }
        
        mostrar();
    }
    
    public void mostrar(){
        
        System.out.print(""+minombre+"::sensacion termica :> "+sent+"\n");
      
    }
}
