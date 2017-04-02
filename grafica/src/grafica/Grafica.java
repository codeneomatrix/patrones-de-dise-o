/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel ;
import java.io.Serializable;
import static java.lang.Double.NaN;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField; 
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Grafica extends JPanel 
                        implements Serializable{
    
    private List<Object> datos= new ArrayList<Object>();
    private String titulo;
    private BigDecimal dato1;
    private String etiqueta1;
    private String etiqueta2;
    private int dato2;
    
    int x=0;
    int y=0;
    int ancho=10;
    int alto=10;
    private int x2;
    private int y2;
    private int ancho2;
    private int alto2;

    public String getTitulo() {
        return titulo;
        
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        System.out.println(titulo);
    }

    public BigDecimal getDato1() {
        return dato1;
    }

    public void setDato1(BigDecimal dato1) {
        try{
        this.dato1 = dato1;
        System.out.println("segunda grafica maxino:"+ 2000);
        int dat=dato1.intValue();
        System.out.println(dat );
         if(dat>=2000){
            dibujar2(300,0,180,190);
        }else{
            dibujar2(300,190-((dat*100)/2000),180,((dat*100)/2000));
            //System.out.println(((dat*100)/2000));
        }
        }catch(Exception e){
            System.out.println(e);
            //dibujar2(300,0,180,190);
        }
    }

    public String getEtiqueta1() {
        return etiqueta1;
        
    }

    public void setEtiqueta1(String etiqueta1) {
        this.etiqueta1 = etiqueta1;
        System.out.println( etiqueta1 );
    }

    public String getEtiqueta2() {
        return etiqueta2;
    }

    public void setEtiqueta2(String etiqueta2) {
        this.etiqueta2 = etiqueta2;
        System.out.println( etiqueta2 );
    }

    public int getDato2() {
        return dato2;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
        System.out.println("primera grafica maxino:"+ 200);
        if(dato2>200){
            dibujar(20,0,180,190);
        }else{
            dibujar(20,190-((dato2*100)/200),180,((dato2*100)/200));
            //System.out.println("dib: "+ (190-((dato2*100)/200)) );
        }
        
    }
    
    
   public void dibujar2(int x,int y,int an,int alto){
        this.x2=x;
        this.y2=y;
        this.ancho2=an;
        this.alto2=alto;
        this.repaint();
    }
   
    public void dibujar(int x,int y,int an,int alto){
        this.x=x;
        this.y=y;
        this.ancho=an;
        this.alto=alto;
        this.repaint();
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(x,y,ancho,alto);
        g.drawRect(x2,y2,ancho2,alto2);
    }

    public List<Object> getDatos() {
        return datos;
    }

    public void setDatos(List<Object> datos) {
        //try{
        this.datos = datos;
        //System.out.println(datos);
        /*for(Object o : datos){
            System.out.println( o );
        }
        }catch(Exception e){
            System.out.println(e);
        }*/
        
    }
    
    
    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
    }
   */
}
