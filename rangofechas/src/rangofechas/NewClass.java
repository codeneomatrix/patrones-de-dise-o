package rangofechas;

import javax.swing.JFrame;


public class NewClass {
   public static void main(String args[]){
       JFrame mi = new JFrame();
       Rangofechas mi_com = new Rangofechas();
       mi_com.setetiqueta1("Fecha compra: ");
       mi_com.setetiqueta2("Fecha envio: ");
       mi.add(mi_com);
       mi.setVisible(true);
   } 
   
}
