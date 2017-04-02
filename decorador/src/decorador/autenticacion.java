
package decorador;

import java.io.IOException;

public class autenticacion extends decradortxt{
    autenticacion(lecturaescrituratexto eleme){
        super(eleme);
    }
    
    public void leer(String t[]){
        System.out.println("contrasena ? ");
        try{
           flujo.readLine(); 
        }catch(IOException ex){
            ex.printStackTrace();
        
    }
        
        super.leer(t);
        
    }
    
    public void escribir(String t[]){
         System.out.println("contrasena ? ");
        try{
           flujo.readLine(); 
        }catch(IOException ex){
            ex.printStackTrace();
        
    }
        
        super.escribir(t);
    }
}
