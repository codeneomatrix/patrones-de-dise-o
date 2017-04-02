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
public class punto implements estrategia{
private double valor1;
private double valor2;
private String nombre;

punto (double v1, double v2) {
valor1= v1;
valor2= v2;
nombre= "punto";
}
@Override
public double dato1(){
		double s = valor1;
		return s;  
	}
@Override
public double dato2(){
		double s = valor2;
		return s;  
	} 
		
@Override
public String escribir(){
		String s = " (" +this.dato1()+ ","+this.dato2()+")\n";
		return s;  
	}

@Override	
public contexto suma(contexto otrod ){
	    estrategia estrategiai = new punto((this.dato1()+otrod.dato1()),(this.dato2()+otrod.dato2()));
		contexto s = new contexto(estrategiai);
		return s;
	}
}
