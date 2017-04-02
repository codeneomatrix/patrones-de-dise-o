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
public class punto extends datocompuesto{
    
    punto(double d1,double d2){
        super(d1,d2);
        super.modosin=new simetricopunto(this);
        super.modoescalar=new escaladoble(this);
        super.modorotar= new rotadoble(this);
    }
    @Override
    public void fijarsuma(){
        super.modosumar=new sumadirecta(this);
	}
    @Override
    public String escribir(){
		String s = " (" +this.dato1()+ ","+this.dato2()+")\n";
		return s;  
	}

}
