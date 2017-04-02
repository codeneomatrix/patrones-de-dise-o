
package composision;

public class Composision {

    public static void main(String[] args) {
        producto pc = new producto("computadora",2);
        
        
        pc.agregar(new articulo(0,"unidad_disco",1,10));
        pc.agregar(new articulo(1,"lector tarjetas",1,5));
        pc.agregar(new articulo(2,"monitor",1,500));
        
        
        System.out.println("precio de "+pc.getdescripcion()+" es $"+pc.getprecio());
        pc.acceder(pc);
        
        articulo mouse=new articulo(20,"mouse",10,20);
        System.out.println("\nprecio de "+mouse.getdescripcion()+" es $"+mouse.getprecio());
    }
    
}
