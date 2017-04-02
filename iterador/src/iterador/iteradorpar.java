
package iterador;

import java.util.ArrayList;
import java.util.Iterator;

public class iteradorpar implements Iterator{
    private  ArrayList<articulo> lista ;
    private int contador; 
    
    public void datos(ArrayList l){
        
        lista = l;
        contador =lista.size();
    }
     public boolean hasNext(){
         return contador>0;
     }
     
     public Object next(){
         contador--;
         return lista.get(contador);
     }
    
}
