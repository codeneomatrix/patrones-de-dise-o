package singleton;
/**
 * @author Neomatrix
 */
public class Singleton {

    public static void main(String[] args) {
        
        NewJFrame panel1 = new NewJFrame();
        //panel1.size(200,200);
        panel1.setVisible(true); 
        
        //singletonclasico instancia1= singletonclasico.getInstancia();
        //System.out.println("\n numero de instancias : "+instancia1.numins());
        //singletonclasico instancia2= singletonclasico.getInstancia();
        //System.out.println("\n numero de instancias : "+instancia2.numins());
        //singletonclasico instancia3= singletonclasico.getInstancia();
        //System.out.println("\n numero de instancias : "+instancia3.numins());
        
        
        hilos y = new hilos();
        hilos e = new hilos();
        
        Thread h= new Thread(y);
        Thread h2= new Thread(e);
        Thread h3= new Thread(y);
        Thread h4= new Thread(y);
        Thread h5= new Thread(e);
        Thread h6= new Thread(y);
        
        h.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();
        
        
        
    }
    
}
