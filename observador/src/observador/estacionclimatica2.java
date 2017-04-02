package observador;

public class estacionclimatica2 {
  
    public static void main(String[] arg){
        datosclimaticos2 datos = new datosclimaticos2();

        condicionesactuales2 observador1 = new condicionesactuales2(datos,"observador1");
        condicionesactuales2 observador2 = new condicionesactuales2(datos,"observador2");
        condicionesactuales2 observador3 = new condicionesactuales2(datos,"observador3");
        estadistica2 observador4 = new estadistica2(datos,"observador4");
        prediccion2 observador5 = new prediccion2(datos,"observador5");
        
        datos.colocandomedidas(10.0f, 15.0f, 30.0f);
        System.out.print("-------------------------------------------------\n");
        datos.colocandomedidas(10.0f, 20.0f, 35.0f);
        System.out.print("-------------------------------------------------\n");
        datos.colocandomedidas(09.0f, 20.0f, 35.0f);
        System.out.print("-------------------------------------------------\n");
        datos.colocandomedidas(1.0f, 40.0f, 40.0f);
        System.out.print("-------------------------------------------------\n");
        
    }
}


