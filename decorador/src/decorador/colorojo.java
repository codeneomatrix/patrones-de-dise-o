package decorador;

public class colorojo extends decradortxt{

    colorojo(lecturaescrituratexto in) {
        super(in);
    }
    
    public void leer(String t[]){
        super.leer(t);
    }

    
    public void escribir(String t[]){
        System.out.println("color rojo");
        t[0]= "\033[31m"+t[0];
        super.escribir(t);
        
        
        
    }
}
