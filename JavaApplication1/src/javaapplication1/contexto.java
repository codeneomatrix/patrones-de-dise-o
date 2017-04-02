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
public class contexto {
	estrategia c;

	public contexto( estrategia c )
	{
		this.c = c;
	}

	public void elegir(estrategia c) {
		this.c = c;
	}
	
	//Método de estrategia 'c'
	public void escribir()
	{
		System.out.print(""+c.escribir()+"\n");
	}
	
	
	public double dato1()
	{
		return c.dato1();
	}

    public double dato2()
	{
		return c.dato2();
	}
	
	public contexto suma(contexto otrod)
	{
		return c.suma(otrod);
	}
}
