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
public class sumavector implements modosumar {
    private datocompuesto e;
    sumavector(datocompuesto yo){
     e=yo;   
    }
    
    @Override
    public datocompuesto sumar(datocompuesto otrod){
        if(e.dato2()==otrod.dato2()){
		vector s = new vector((e.dato1()+otrod.dato1()),otrod.dato2());
		return s;
	   }
		vector s = new vector(0.0,0.0);
		return s;

    }
    
}