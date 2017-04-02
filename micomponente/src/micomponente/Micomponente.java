
package micomponente;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.beans.*;
import java.io.Serializable;

public class Micomponente extends JPanel  implements Serializable {

    private JLabel etiqueta;
    private JTextField dato;
    private boolean numeros=true;
    private boolean letras=false;
    private boolean caracteres=false;
    
    Micomponente(){
       etiqueta=new JLabel(" ");
       dato=new JTextField(20);
       add(etiqueta);
       add(dato);
       //dato.addKeyListener(this);
    }
    
    public void setetiqueta(String e){
        etiqueta.setText(e);
    }
    
    public String getetiqueta(){
        return etiqueta.getText();
    }
    
    public String getvalortexto(){
        return dato.getText();
    }
    
    public int getvalorentero(){
        return Integer.parseInt(dato.getText());
    }
    
    
   

    /*Metodo que filtra caracteres solo acepta letras
    private void soloLetras() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (getText().length() < getMaxlength()) {
                    if (!Character.isLetter(caracter)) {
                        e.consume();
                    }
                } else {
                    e.consume();
                }
            }
        });
    }
    
    private void soloNumeroReal() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                // Verificar si la tecla pulsada no es un digito
                if (getText().length() < getMaxlength()) {
                    if ((!Character.isDigit(caracter))
                            && ((caracter < '.') || (caracter > '.'))
                            && (caracter != KeyEvent.VK_BACK_SPACE)) {
                        e.consume();  // ignorar el evento de teclado
                    } else {
                        if (getText().contains(".")) {
                            if ((!Character.isDigit(caracter))
                                    && (caracter != KeyEvent.VK_BACK_SPACE)) {
                                e.consume();  // ignorar el evento de teclado
                            }
                        }
                    }
                } else {
                    e.consume();
                }
            }
               });
    }*/
}
