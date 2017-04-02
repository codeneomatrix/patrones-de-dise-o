
package decorador;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class lecturaescrituratexto {
    BufferedReader flujo= new BufferedReader(new InputStreamReader(System.in));
    
    public abstract void leer(String t[]);
    public abstract void escribir(String t[]);
}
