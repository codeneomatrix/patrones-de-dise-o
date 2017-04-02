/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Neomatrix
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
	public static void main(String args[]){
	
		estrategia estrategia1 = new vector(5.0, 10.0);
		estrategia estrategia2 = new vector(10.0, 10.0);
		estrategia estrategia3 = new punto(4.0, 10.0);
		estrategia estrategia4 = new punto(2.0, 1.0);
                estrategia estrategia5 = new fraccion(4.0, 8.0);
		estrategia estrategia6 = new fraccion(2.0, 3.0);

		contexto context1 = new contexto(estrategia1);
		context1.escribir();
		
		contexto context2 = new contexto(estrategia2);
		context2.escribir();
		
		
		System.out.print("sumando vector1+vector2:\n");
		contexto context3 = context1.suma(context2);
		context3.escribir();
		
		//---------------------------------------------------------------
		
		context1.elegir(estrategia3);
		context1.escribir();
		
		context2.elegir(estrategia4);
		context2.escribir();
		
		System.out.print("sumando punto1+punto2:\n");
		contexto context4 = context1.suma(context2);
		context4.escribir();
                
                //---------------------------------------------------------------
		
		context1.elegir(estrategia5);
		context1.escribir();
		
		context2.elegir(estrategia6);
		context2.escribir();
		
		System.out.print("sumando fraccion1+fraccion2:\n");
		contexto context5 = context1.suma(context2);
		context5.escribir();
	}

    
}
