
package iterador;

import java.util.ArrayList;
import java.util.Iterator;

public class iteralista implements Iterator{
    private  ArrayList<articulo> lista ;
    private int contador; 
    iteralista(){
        
        contador =0;
    }
    public void datos(ArrayList l){
        lista = l;
    }
     public boolean hasNext(){
         return contador<lista.size();
     }
     public Object next(){
         return lista.get(contador++);
     }
    
}
