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
public class sumafraccion implements modosumar {
    private datocompuesto e;
    sumafraccion(datocompuesto yo){
     e=yo;   
    }
    
    @Override
    public datocompuesto sumar(datocompuesto otrod){
        if((e.dato2()==otrod.dato2())&& (otrod.dato2()>0 && e.dato2()>0) ){
		fraccion f = new fraccion((e.dato1()+otrod.dato1()),otrod.dato2());
		return f;
	   }
            if((e.dato2()!=otrod.dato2())&& (otrod.dato2()>0 && e.dato2()>0) ){
                
		fraccion f = new fraccion(((e.dato1()*otrod.dato2())+(otrod.dato1()*e.dato2())),(otrod.dato2()*e.dato2()));
		return f;
	   }
		fraccion f = new fraccion(0.0,0.0);
		return f;
	}

}

