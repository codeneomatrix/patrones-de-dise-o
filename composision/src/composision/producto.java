
package composision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class producto implements componente{
    private ArrayList Componentes;
    private int id;
    private String descripcion;
    private int cantidad;
    
    producto(String descripcio,int cantida ){
        Componentes= new ArrayList();
        Random rnd = new Random();
        id=cantida+rnd.nextInt();
        descripcion=descripcio;
        cantidad=cantida;
    }
    
     int getprecio(){
        int p=0;
        Iterator it= Componentes.iterator();
        while(it.hasNext()){
            componente c = (componente) it.next();
            if (c instanceof articulo){
             articulo te= (articulo)c;
             p+=te.getprecio();
            }else {
            p=0;
            }
        }
        return p;
    }
    
    String getdescripcion(){
        return descripcion;
    }
    
    int getcantidad(){
        return cantidad;
    }

    @Override
    public void agregar(componente r) {
        Componentes.add(r);
    }

    @Override
    public void remover(componente r) {
        Componentes.remove(r);
    }

    @Override
    public void acceder(componente r) {
        System.out.println("\nProducto:"+descripcion+"\n formado por los siguientes articulos:");
        
        Iterator it= Componentes.iterator();
        while(it.hasNext()){
            componente c = (componente) it.next();
            c.acceder(r);
        }

    }

   
    
    
}
