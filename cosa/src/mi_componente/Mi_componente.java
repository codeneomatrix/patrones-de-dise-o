
package mi_componente;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel ;
import java.io.Serializable;
import static java.lang.Double.NaN;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Mi_componente extends JPanel 
                        implements Serializable,KeyListener {
    private JLabel etiqueta;
    private JTextField dato;
    private boolean numeros=true;
    private boolean letras=false;
    private boolean caracteres=false;
    private boolean decimales=false;
    private String sal="";
    private boolean noletras=false;
    private boolean nonumeros=false;
    private int minimo=0;
    private int maximo=1;
    private int minimod=0;
    private int maximod=4;
    private boolean contar=false;
    private int contados=-1;
    
    
    public Mi_componente() {
        etiqueta=new JLabel(" ");
       dato=new JTextField(20);
       add(etiqueta);
       add(dato);
       dato.addKeyListener(this);
       dato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validar(evt);
            }
        });
    } 
    
    public void setetiqueta(String e){
        etiqueta.setText(e);
    }
    
    public String getetiqueta(){
        return etiqueta.getText();
    }
    
    
    private void validar(java.awt.event.FocusEvent evt) { 
       //System.out.println();
       
        if(letras || caracteres){
            if(dato.getText().length()<minimo){
            JOptionPane.showMessageDialog(null," FALTAN CARACTERES EN EL CAMPO: "+etiqueta.getText());
            noletras=true;
           }else if(dato.getText().length()==0){
                   JOptionPane.showMessageDialog(null," FALTAN CARACTERES EN EL CAMPO: "+etiqueta.getText());
                   }
            else{
                noletras=false;
            }
        }
        if(numeros){
            try{
            if(Integer.parseInt(dato.getText())>maximo){
            JOptionPane.showMessageDialog(null," EN EL CAMPO: "+etiqueta.getText()+" COLOQUE UN VALOR MENOR A "+ maximo);
            nonumeros=true;
           }else if(Integer.parseInt(dato.getText())<minimo){
            JOptionPane.showMessageDialog(null," EN EL CAMPO: "+etiqueta.getText()+" COLOQUE UN VALOR MAYOR/IGUAL A "+ minimo);
            nonumeros=true;
           }else{
               nonumeros=false;
           }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null," EN EL CAMPO: "+etiqueta.getText()+" COLOQUE UN VALOR MAYOR/IGUAL A "+ minimo);
            }
        }
        
        if(decimales){
            
            if(contados<minimo){
            JOptionPane.showMessageDialog(null," FALTAN "+(minimo-contados)+" DECIMALES EN EL CAMPO: "+etiqueta.getText());
           }
        }
    } 
    
    public String getvalortexto(){
        if(noletras){
            return "";
        }
        return dato.getText();
    }
    
    
    public int getvalorentero(){
        if(!numeros){
           return (int) NaN; 
        }
        return Integer.parseInt(dato.getText());
    }
    
    public double getvalordecimal(){
        if(!decimales){
           return  NaN; 
        }
        return Double.parseDouble(dato.getText());
    }
    
    public void setminimo(int e){
        minimo=e;
    }
    
    public int getminimo(){
        return minimo;
    }
    
    public void setminimod(int e){
        
        minimod=e;
        
    }
    
    public int getminimod(){
        return minimod;
    }
    
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void setmaximod(int e){
     //String v= e+"";
     //String[] s=v.split(".");
      
     //System.out.println(s.toString());
     maximod=e;
    }
    
    public int getmaximod(){
        return maximod;
    }
   
    public void setmaximo(int e){
        maximo=e;
    }
    
    public int getmaximo(){
        return maximo;
    }
    
    public void setnumeros(boolean e){
        numeros=e;
        letras=false;
        caracteres=false;
        decimales=false;
    }
    public void setletras(boolean e){
        letras=e;
        caracteres=false;
        numeros=false;
        decimales=false;
    }
    public void setcaracteres(boolean e){
        caracteres=e;
        letras=false;
        numeros=false;
        decimales=false;
    }
    public void setdecimales(boolean e){
        decimales=e;
        caracteres=false;
        letras=false;
        numeros=false;
        
    }
    
    
    public boolean getnumeros(){
        return numeros;
    }
    public boolean getletras(){
        return letras;
    }
    public boolean getcaracteres(){
        return caracteres;
    }
    public boolean getdecimales(){
        return decimales;
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.print("");
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
        char key= e.getKeyChar();
        if(numeros){
            if(key>='0'&& key<='9'){
                sal+=key;                
            }
        }
        if(decimales){
          
           if(contados<maximo-1){
               
               if((key=='.')&& contar==false){
                   sal+=key;
                    System.out.println("contandooooo");
                    if(!contar){
                        contar=true;
                    }
                }
               
               if((key>='0'&& key<='9')){
                sal+=key;                
                
                if(contar){
                        contados=contados+1;
                    }
                System.out.println(contados);
            }
               
           }
           
            
        }
        if(letras){
            if(dato.getText().length()<maximo){
                if((key>='a'&& key<='z')||(key>='A'&& key<='Z')){
                sal+=key;                
              }
            }
        }
        if(caracteres){
            if(dato.getText().length()<maximo){
                if((key>='!'&& key<='~')||(e.getKeyCode()>=128 && e.getKeyCode()<=254)||(e.getKeyCode()==0)){
                sal+=key;                
            }
           }
        }
        //dato.setText("");
        dato.setText(sal);
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
         if((e.getKeyCode())==KeyEvent.VK_BACK_SPACE){
            sal=dato.getText();
            if(contar){
                        contados=contados-1;
                        if(contados==-1){
                            contar=false;
                        }
                    }
        }else{
             if(dato.getText().length()!=0){
                 dato.setText(dato.getText().substring(0, dato.getText().length()-1));
             }
         }
         //System.out.println(sal);
         dato.setText(sal);
   }
}