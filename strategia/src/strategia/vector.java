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
public class vector extends datocompuesto{

    vector(double d1,double d2){
        super(d1,d2);
        super.modosin=new simetricovector(this);
        super.modoescalar=new escalasimple(this);
        super.modorotar=new rotasimple(this);
    }
    @Override
    public void fijarsuma(){
        super.modosumar=new sumavector(this);
	}
   @Override
    public String escribir(){
		String s = "" +this.dato1()+ "@"+this.dato2()+"\n";
		return s;  
	}
    
}
