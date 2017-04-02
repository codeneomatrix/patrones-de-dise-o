package decorador;

public class colorazul extends decradortxt{

    colorazul(lecturaescrituratexto in) {
        super(in);
    }
    
    public void leer(String t[]){
        super.leer(t);
    }

    
    public void escribir(String t[]){
        System.out.println("color azul");
        t[0]= "\033[34m"+t[0];
        super.escribir(t);
    }
}
