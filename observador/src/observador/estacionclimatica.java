/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

/**
 *
 * @author Neomatrix
 */
public class estacionclimatica {
    public static void main(String[] arg){
        datosclimaticos datos = new datosclimaticos();
        String d1[] = {"temperatura","humedad"};
        String d2[] = {"temperatura","presion"};
        String d3[] = {"humedad","presion"};
        
        mostrarcondicionesactuales observador1 = new mostrarcondicionesactuales(datos,d1,"observador1");
        mostrarcondicionesactuales observador2 = new mostrarcondicionesactuales(datos,d2,"observador2");
        mostrarcondicionesactuales observador3 = new mostrarcondicionesactuales(datos,d3,"observador3");
        estadistica observador4 = new estadistica(datos,d2,"observador4");
        prediccion observador5 = new prediccion(datos,d2,"observador5");
        sensaciontermica observador6 = new sensaciontermica(datos,d1,"observador6");
        
        datos.colocandomedidas(30.0f, 5.0f, 30.0f);
        System.out.print("-------------------------------------------------\n");
        datos.colocandomedidas(30.0f, 0.0f, 35.0f);
        System.out.print("-------------------------------------------------\n");
        datos.colocandomedidas(40.0f, 0.0f, 35.0f);
        System.out.print("-------------------------------------------------\n");
        datos.colocandomedidas(45.0f, 6.0f, 40.0f);
        System.out.print("-------------------------------------------------\n");
        
    }
}
