/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Neomatrix
 */
public class singletonclasico {
   private static singletonclasico instancia;
   private static int numins=0;

//static {
//instancia = new singletonclasico()
//}

singletonclasico(){
    numins++;
}

public static singletonclasico getInstancia() {
    if(instancia == null) {
        instancia = new singletonclasico();
    }
    System.out.println("\n Se creó una instancia");
    return instancia;
}
public int numins(){
    return numins;
}
}
