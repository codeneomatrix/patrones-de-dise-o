/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observador;

/**
 *
 * @author acer
 */
public class prediccion implements observador, mostrarelemento{
    private float dato;
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
    
    prediccion(sujeto datosclimaticos,String[] aspecto,String nombre){
        this.datosclimaticos= datosclimaticos;
        this.minombre=nombre;
        datosclimaticos.registrarobservador(this,aspecto);
    }
    
    public void actualiza( String dato,float aspecto){
        this.dato = aspecto;
        this.aspect= dato;
        if("temperatura".equals(dato)){
            if(aspecto>ta){
                ta=aspecto;
                ts=true;
                //System.out.print(""+ta+"\n");
            }
            if(aspecto<ta){
                ta=aspecto;
                tb=true;
                //System.out.print(""+ta+"\n");
            }
        }
        if("humedad".equals(dato)){
            if(aspecto>ha){
                ha=aspecto;
                hs=true;
                //System.out.print(""+ha+"\n");
            }
            if(aspecto<ha){
                ha=aspecto;
                hb=true;
                //System.out.print(""+ha+"\n");
            }
        }
        if("presion".equals(dato)){
            if(aspecto>pa){
                pa=aspecto;
                ps=true;
                //System.out.print(""+pa+"\n");
            }
            if(aspecto<pa){
                pa=aspecto;
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
    
    public void mostrar(){
        if(pro!=null){
            System.out.print(""+minombre+"::"+pro+"\n");
        }
            
            
       
    }
}
