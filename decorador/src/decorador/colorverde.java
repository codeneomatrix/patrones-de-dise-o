package decorador;

public class colorverde extends decradortxt{

    colorverde(lecturaescrituratexto in) {
        super(in);
    }
    
    public void leer(String t[]){
        super.leer(t);
    }

    
    public void escribir(String t[]){
        System.out.println("color verde");
        t[0]= "\033[32m"+t[0];
        super.escribir(t);
    }
}
