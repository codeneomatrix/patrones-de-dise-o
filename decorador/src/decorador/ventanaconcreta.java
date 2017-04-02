package decorador;

public class ventanaconcreta implements ventana{
    
    public void dibujar(){
        System.out.println("ventana");
    }
    public String getdescription(){ 
        return "ventana simple";
    }
    
}
