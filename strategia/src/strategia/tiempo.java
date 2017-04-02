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
public class tiempo extends datocompuesto{
    
    tiempo(int d1,int d2){
        super(d1,d2);
        super.modosin=new simetricotiempo(this);
        super.modoescalar=new escalartiempo(this);
        super.modorotar= new rotartiempo(this);
    }
    @Override
    public void fijarsuma(){
        super.modosumar=new sumartiempo(this);
	}
    @Override
    public String escribir(){
		String s = "" +this.dato1()+ ":"+this.dato2()+"\n";
		return s;  
	}

    
}
