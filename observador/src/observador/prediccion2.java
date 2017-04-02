/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observador;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author acer
 */
public class prediccion2 implements Observer,mostrarelemento{
    private Observable observable; 
    private float dato;
    private float temperatura;
    private float presion;
    private String aspect;
    private String minombre;
    private sujeto datosclimaticos;
    private float ta=0.0f;
    private boolean ts=false;
    private boolean tb=false;
    private float ha=0.0f;
    private boolean hs=false;
    private boolean hb=false;
    private float pa=0.0f;
    private boolean ps=false;
    private boolean pb=false;
    private String pro;
    
    prediccion2(Observable observable,String nombre){
         this.observable= observable;
        observable.addObserver(this);
        this.minombre=nombre;
    }
    
    public void update( Observable obs,Object arg){
    
        if (obs instanceof datosclimaticos2){
            datosclimaticos2 data= (datosclimaticos2)obs;
            
            if(this.temperatura!= data.gettemperatura()){
                this.temperatura= data.gettemperatura();
               
                if(temperatura>ta){
                    ta=temperatura;
                    ts=true;
                    //System.out.print(""+ta+"\n");
                }
                if(temperatura<ta){
                    ta=temperatura;
                    tb= true;
                    //System.out.print(""+ta+"\n");
                }
        }
        
         if(this.presion!= data.getpresion()){
             
            this.presion= data.getpresion();
         
            if(presion>pa){
                pa=presion;
                ps=true;
                //System.out.print(""+pa+"\n");
            }
            if(presion<pa){
                pa=presion;
                pb=true;
                //System.out.print(""+pa+"\n");
            }
        }
        
        if(((pb==false)&&(ts==false))||((ps==false)&&(tb==false))){
            pro="No cambian las condiciones";
        }
        if((pb==true)&&(ts==true)){
            pro="Calor";
            pb=false;
            ts=false;
        }
        if((ps==true)&&(tb==true)){
            pro="Posibles lluvias";
            ps=false;
            tb=false;
        }
        
       
        mostrar();
    }
}
    
    public void mostrar(){
        if(pro!=null){
            System.out.print(""+minombre+"::"+pro+"\n");
            pro=null;
        }    
    }
    
}
