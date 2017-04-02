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
public class datosclimaticos implements sujeto{
    private ArrayList observadores;
    private ArrayList aspectos;
    private float temperatura;
    private float humedad;
    private float presion;
    
    datosclimaticos(){
        observadores = new ArrayList();
        aspectos = new ArrayList();
    }
    @Override
    public void registrarobservador(observador o,String[] aspecto){
        observadores.add(o);
        aspectos.add(aspecto);
    }
    @Override
    public void removerobservador(observador o){
        int i= observadores.indexOf(o);
        if(i>=0){
            this.observadores.remove(i);
            this.aspectos.remove(i);
        }
    }
    @Override
    public void notificarobservadores(String aspecto){
        observador ob; 
        for(int i=0; i<aspectos.size();i++){
            String[] elemento;
            elemento = (String[]) this.aspectos.get(i);
            
            for(int j=0; j<elemento.length;j++){
                if((elemento[j]=="temperatura")&&(elemento[j]==aspecto)){
                    ob = (observador) this.observadores.get(i);
                    ob.actualiza("temperatura",temperatura);
                }
                if((elemento[j]=="humedad")&&(elemento[j]==aspecto)){
                    ob = (observador) this.observadores.get(i);
                    ob.actualiza("humedad",humedad);
                }
                if((elemento[j]=="presion")&&(elemento[j]==aspecto)){
                    ob = (observador) this.observadores.get(i);
                    ob.actualiza("presion",presion);
                }
            }
        }
    }
    
    public void cambiandomedidas(String aspecto){
        notificarobservadores(aspecto);
    }
    
    public void colocandomedidas(float temperatura, float humedad, float presion){
        if(Math.abs(this.temperatura-temperatura)>=2){
            this.temperatura=temperatura;
            cambiandomedidas("temperatura");
        }
        if(Math.abs(this.humedad-humedad)>=2){
            this.humedad=humedad;
            cambiandomedidas("humedad");
        }
        if(Math.abs(this.presion-presion)>=2){
            this.presion=presion;
            cambiandomedidas("presion");
        }

    }
}
