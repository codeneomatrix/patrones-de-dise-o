
package decorador;

import java.io.IOException;

public class ioarchivo extends lecturaescrituratexto{
    @Override
    public void leer(String t[]){
        System.out.println("texto :"+t[0]);
    }
    @Override
    public void escribir(String t[]){
        System.out.println("texto ? ");
        try{
            t[0]=t[0]+flujo.readLine();
        }
        catch(IOException ex){
            ex.printStackTrace();
        
    }
    }
}
