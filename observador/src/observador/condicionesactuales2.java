package observador;
import java.util.Observable;
import java.util.Observer;

public class condicionesactuales2 implements Observer,mostrarelemento{
    private Observable observable;        
    private String minombre;
    private float temperatura,presion,humedad;
    
    condicionesactuales2(Observable observable,String nombre){
        this.observable= observable;
        observable.addObserver(this);
        this.minombre=nombre;
    }
    
    @Override
    public void update( Observable obs,Object arg){
        if (obs instanceof datosclimaticos2){
            datosclimaticos2 data= (datosclimaticos2)obs;
            this.temperatura= data.gettemperatura();
            this.presion= data.getpresion();
            this.humedad= data.gethumedad();
        }
        mostrar();
    }
    
    @Override
    public void mostrar(){
        System.out.print(""+minombre+":temperatura "+temperatura+":presion "+presion+":humedad "+humedad+"\n");}
}