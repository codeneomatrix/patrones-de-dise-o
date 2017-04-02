package decorador;

public class alinearizquierda extends decradortxt{

    alinearizquierda(lecturaescrituratexto in) {
        super(in);
    }
    
    public void leer(String t[]){
        super.leer(t);
    }
    
    public void escribir(String t[]){
        System.out.println("alineacion izquierda");

        super.escribir(t);
        t[0]= ""+t[0];
       
    }
}
