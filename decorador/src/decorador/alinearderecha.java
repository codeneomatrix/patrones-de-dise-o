package decorador;

public class alinearderecha extends decradortxt{

    alinearderecha(lecturaescrituratexto in) {
        super(in);
    }
    
    public void leer(String t[]){
        super.leer(t);
    }
    
    public void escribir(String t[]){
        System.out.println("alineacion derecha");

        super.escribir(t);
        t[0]= "                                                 "+t[0];
        
    }
}
