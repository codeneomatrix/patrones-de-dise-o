/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strategia;

/**
 *
 * @author acer
 */
public class fraccion extends datocompuesto{
    
    fraccion(double d1,double d2){
        super(d1,d2);
        super.modosin=new simetricofraccion(this);
        super.modoescalar=new escalafraccion(this);
        super.modorotar=new rotafraccion(this);
    }
    @Override
    public void fijarsuma(){
        super.modosumar=new sumafraccion(this);
	}
    
    @Override
    public String escribir(){
		String s = "" +this.dato1()+ "/"+this.dato2()+"\n";
		return s;  
	}
}
