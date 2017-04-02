
package fabrica;

public class Fabrica {

    public static void main(String[] args) {
        programa c = new programacc();
        ventana v= c.crearventana("marco");
        v.definirla();
        v.mostrarla();
        
        programa pc = new programacc();
        v= pc.crearventana("panel");
        v.definirla();
        v.mostrarla();
        
        programa j = new programaj();
        v= j.crearventana("marco");
        v.definirla();
        v.mostrarla();
        
        programa pj = new programaj();
        v= pj.crearventana("panel");
        v.definirla();
        v.mostrarla();
    }
    
}
