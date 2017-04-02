/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton;

/**
 *
 * @author acer
 */
public class hilos implements Runnable{
    @Override
	public void run() {
            singletonclasico y = singletonclasico.getInstancia();
            System.out.println("\n numero de instancias : "+y.numins());
            singletonclasico x = singletonclasico.getInstancia();
            System.out.println("\n numero de instancias : "+x.numins());
        }
}
