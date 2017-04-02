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
public class estadistica implements observador, mostrarelemento{
    private float dato;
    private String aspect;
    private String minombre;
    private sujeto datosclimaticos;
    private float maxt=0.0f;
    private float mint=100000.0f;
    private float avgt=0.0f;
    private float datost=0.0f;
    private float totalt=0.0f;
    private float maxh=0.0f;
    private float minh=100000.0f;
    private float avgh=0.0f;
    private float datosh=0.0f;
    private float totalh=0.0f;
    private float maxp=0.0f;
    private float minp=100000.0f;
    private float avgp=0.0f;
    private float datosp=0.0f;
    private float totalp=0.0f;
    
    estadistica(sujeto datosclimaticos,String[] aspecto,String nombre){
        this.datosclimaticos= datosclimaticos;
        this.minombre=nombre;
        datosclimaticos.registrarobservador(this,aspecto);
    }
    
    public void actualiza( String dato,float aspecto){
        this.dato = aspecto;
        this.aspect= dato;
        if(dato=="temperatura"){
            if(aspecto>maxt){
                maxt=aspecto;
            }
            if(aspecto<mint){
                mint=aspecto;
            }
            totalt+=aspecto;
            datost+=1.0f;
            avgt=totalt/datost;
        }
        if(dato=="humedad"){
            if(aspecto>maxh){
                maxh=aspecto;
            }
            if(aspecto<minh){
                minh=aspecto;
            }
            totalh+=aspecto;
            datosh+=1.0f;
            avgh=totalh/datosh;
        }
        if(dato=="presion"){
            if(aspecto>maxp){
                maxp=aspecto;
            }
            if(aspecto<minp){
                minp=aspecto;
            }
            totalp+=aspecto;
            datosp+=1.0f;
            avgp=totalp/datosp;
        }
       
        mostrar();
    }
    
    public void mostrar(){
        if(aspect == "temperatura"){
            System.out.print(""+minombre+"::"+aspect+"--> max:"+maxt+" / min:"+mint+"/ avg:"+avgt+"\n");
        }
        if(aspect == "humedad"){
            System.out.print(""+minombre+"::"+aspect+"--> max:"+maxh+" / min:"+minh+"/ avg:"+avgh+"\n");
        }
        if(aspect == "presion"){
            System.out.print(""+minombre+"::"+aspect+"--> max:"+maxp+" / min:"+minp+"/ avg:"+avgp+"\n");
        }
    }
}
