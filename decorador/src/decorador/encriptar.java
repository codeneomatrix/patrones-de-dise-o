package decorador;

import java.io.IOException;

public class encriptar extends decradortxt{
    
    encriptar(lecturaescrituratexto ioarchivo) {
        super(ioarchivo);
    }
    
    public void leer(String t[]){
        System.out.println("encriptar off");
       StringBuffer ot = new StringBuffer(t[0]);
        for(int p=0; p<(ot.length()); p++){
            ot.setCharAt(p,(char)(ot.charAt(p)-5));
        }
        t[0]= ot.toString();
        super.leer(t);
        
    }
    
    public void escribir(String t[]){
         System.out.println("encriptar on ");
       
        super.escribir(t);
        StringBuffer ot = new StringBuffer(t[0]);
        for(int p=0; p<(ot.length()); p++){
            ot.setCharAt(p,(char)(ot.charAt(p)+5));
        }
        t[0]= ot.toString();
    }
}
