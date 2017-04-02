
package mi_componente;

import javax.swing.JFrame;

public class NewClass {
   public static void main(String args[]){
       JFrame mi = new JFrame();
       Mi_componente mi_com = new Mi_componente();
       mi_com.setetiqueta("jaja");
       mi_com.setnumeros(true);
       mi_com.setmaximo(10);
       mi_com.setminimo(2);
       mi.add(mi_com);
       mi.setVisible(true);
   } 
}