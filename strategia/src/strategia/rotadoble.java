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
public class rotadoble implements modorotar{
    private datocompuesto e;
    rotadoble(datocompuesto yo){
     e=yo;   
    }
    
    @Override
     public void rota(int rota){
        
      double x = e.dato1();
      double y = e.dato2();
         
       double r= Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
       double t=Math.atan(y/x);
               
       t=t+(rota);//*0.0174533);
       
       x=r*Math.cos(t*0.0174533);
       y=r*Math.sin(t*0.0174533);
       
       punto w= new punto(x,y);
       System.out.print(""+w.escribir()+"\n");
    }
    
}

