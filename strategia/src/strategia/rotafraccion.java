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
public class rotafraccion implements modorotar{
    private datocompuesto e;
    rotafraccion(datocompuesto yo){
     e=yo;   
    }
    
    @Override
     public void rota(int rota){
       System.out.print("operacion no aplicable\n");
    }
}
