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
public class rotasimple implements modorotar{
    private datocompuesto e;
    rotasimple(datocompuesto yo){
     e=yo;   
    }
    
    @Override
     public void rota(int rota){
       vector r= new vector(e.dato1(),e.dato2()+rota);
       System.out.print(""+r.escribir()+"\n");
    }
}
