
package composision;

public class articulo implements componente{
    int id_producto;
    String descripcion;
    int cantidad;
    int precio;
    
    articulo(int id,String d,int cant,int prec ){
    id_producto=id;
    descripcion=d;
    cantidad=cant;
    precio=prec;
    }
    
    String getdescripcion(){
        return descripcion;
    }
    
    int getcantidad(){
        return cantidad;
    }
    
    int getprecio(){
        return precio;
    }
    
    int importe(){
        return precio*cantidad;
    }
    
    String mostrar(){
        return descripcion;
    }

    @Override
    public void agregar(componente r) {
        
    }

    @Override
    public void remover(componente r) {
        
    }

    @Override
    public void acceder(componente r) {
      System.out.println("- "+descripcion+ "   $"+precio);
    }
    
    
}
