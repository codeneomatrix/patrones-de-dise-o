/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategia;

/**
 *
 * @author Neomatrix
 */
public abstract class datocompuesto {
private double valor1;
private double valor2;
protected modosumar modosumar;
protected modoescalar modoescalar;
protected modosimetrico modosin;
protected modorotar modorotar;

datocompuesto(double v1, double v2) {
valor1= (double)v1;
valor2= (double)v2;
}
public double dato1(){
		double s = valor1;
		return s;  
	}

public double dato2(){
		double s = valor2;
		return s;  
	} 
public void fijarsuma(){
  
	}

public void fijarsin(){

	} 
		

public String escribir(){
		String s = " " +this.dato1()+ " "+this.dato2()+"\n";
		return s;  
	}

}
