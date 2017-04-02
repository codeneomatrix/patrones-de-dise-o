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
public class rotartiempo implements modorotar{
    private datocompuesto e;
    rotartiempo(datocompuesto yo){
     e=yo;   
    }
    
    @Override
     public void rota(int rota){
       System.out.print("Operacion no aplicable\n");
    }
}
