package observador;
import java.util.Observable;
import java.util.Observer;

public class estadistica2 implements Observer,mostrarelemento{
    private Observable observable; 
    private float temperatura;
    private float presion;
    private float humedad;
    private String aspect;
    private String minombre;
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
    
    estadistica2(Observable observable,String nombre){
        this.observable= observable;
        observable.addObserver(this);
        this.minombre=nombre;
    }
    
    public void update( Observable obs,Object arg){
        if (obs instanceof datosclimaticos2){
            datosclimaticos2 data= (datosclimaticos2)obs;
            
            if(this.temperatura!= data.gettemperatura()){
                this.temperatura= data.gettemperatura();
                aspect="temperatura";
                if(temperatura>maxt){
                    maxt=temperatura;
                }
                if(temperatura<mint){
                    mint=temperatura;
                }
                totalt+=temperatura;
                datost+=1.0f;
                avgt=totalt/datost;
            }
            
            if(this.presion != data.getpresion()){
                this.presion= data.getpresion();
                aspect="presion";
                    if(presion>maxp){
                        maxp=presion;
                    }
                    if(presion<minp){
                        minp=presion;
                    }
                    totalp+=presion;
                    datosp+=1.0f;
                    avgp=totalp/datosp;
            } 
        }
        mostrar();
    }
    
    public void mostrar(){
        if(aspect == "temperatura"){
           
        }
        if(aspect == "humedad"){
            System.out.print(""+minombre+"::"+aspect+"--> max:"+maxh+" / min:"+minh+"/ avg:"+avgh+"\n");
        }
        if(aspect == "presion"){
            System.out.print(""+minombre+"::"+aspect+"--> max:"+maxp+" / min:"+minp+"/ avg:"+avgp+"\n");
             System.out.print(""+minombre+"::temperaturat--> max:"+maxt+" / min:"+mint+"/ avg:"+avgt+"\n");
        }
    }
}
