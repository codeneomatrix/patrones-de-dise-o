
package iterador;

public class articulo {
    private String nombre;
    private int cantidad;
    private int precio;
    
    articulo(String n, int c, int p){
    nombre=n;
    cantidad=c;
    precio=p;
    }
    
    public String toString(){
        return nombre+" "+precio+" "+cantidad+"\n";
    }
}
