package iterador;

public class Iterador {

    public static void main(String[] args) {
        
        /*System.out.println("Vector en memoria");
        vectormemoria vector = new vectormemoria(5);
    	vector.colocar(0, 1);
        vector.colocar(4, 5);
    	
        
    	iiterador iterador = vector.creariterador();
    	while (iterador.hasNext()){
            System.out.println(iterador.next());  
        }
        
        
        System.out.println("--------------------------------------");
        System.out.println("Vector en disco");
        
        vectordisco vectord = new vectordisco(5);
        vectord.colocar(0, 1);
        vectord.colocar(4, 5);
        
        
        iiterador iterador2 = vectord.creariterador();
    	while (iterador2.hasNext()){
            System.out.println(iterador2.next());  
        }*/
        
        
        listaarticulo lista= new listaarticulo();
        
        lista.add(new articulo("manzana",10,20));
        lista.add(new articulo("pera",5,30));
        lista.add(new articulo("lechuga",10,20));
        lista.add(new articulo("uva",100,2));
        
        lista.mostrar(new iteralista());
        lista.mostrar(new iteradorpar());
        
    }
    
}
