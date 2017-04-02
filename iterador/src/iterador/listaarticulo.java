
package iterador;

import java.util.ArrayList;
import java.util.Iterator;

public class listaarticulo {
    private  ArrayList<articulo>  articulos;
    
    listaarticulo(){
        articulos = new ArrayList<articulo>();
    }
    public void add(articulo ar){
        articulos.add(ar);
    }
    public void mostrar(iteralista i){
        i.datos(articulos);
        while(i.hasNext()){
            System.out.print(((articulo)i.next()).toString());
        }
    }
    
    public void mostrar(iteradorpar i){
        i.datos(articulos);
        while(i.hasNext()){
            System.out.print(((articulo)i.next()).toString());
        }
    }
}
