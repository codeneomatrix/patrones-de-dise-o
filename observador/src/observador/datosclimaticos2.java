/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.util.ArrayList;
import java.util.Observable;
/**
 *
 * @author Neomatrix
 */
public class datosclimaticos2 extends Observable{
    
    private ArrayList observadores;
    private ArrayList aspectos;
    private float temperatura;
    private float humedad;
    private float presion;
    
    datosclimaticos2(){ }
    
    
    
    public void cambiandomedidas(){
        setChanged();
        notifyObservers();
    }
    
    public void colocandomedidas(float temperatura, float humedad, float presion){
        if(Math.abs(this.temperatura-temperatura)>=2){
            this.temperatura=temperatura;
        }
        if(Math.abs(this.humedad-humedad)>=2){
            this.humedad=humedad;
        }
        if(Math.abs(this.presion-presion)>=2){
            this.presion=presion;
        }
        cambiandomedidas();
    }
    
    public float gettemperatura(){
        return temperatura;
    }
    public float gethumedad(){
        return humedad;
    }
    public float getpresion(){
        return presion;
    }
}
