package decorador;

public class alinearcentro extends decradortxt{

    alinearcentro(lecturaescrituratexto in) {
        super(in);
    }
    
    public void leer(String t[]){
        super.leer(t);
    }

    
    public void escribir(String t[]){
        System.out.println("alineacion centro");

        super.escribir(t);
        t[0]= "                    "+t[0];
        
    }
}
