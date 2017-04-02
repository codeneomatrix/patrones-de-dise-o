
package decorador;

public abstract class decradortxt extends lecturaescrituratexto{
    private lecturaescrituratexto elemento;
    
    decradortxt(lecturaescrituratexto eleme){
        elemento=eleme;
    }
    
    public void leer(String t[]){
        elemento.leer(t);
    }
    public void escribir(String t[]){
        elemento.escribir(t);
    }
}
