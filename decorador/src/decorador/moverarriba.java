package decorador;

import java.awt.Graphics;

public class moverarriba extends deco{
    
    moverarriba(apanel eleme){
        super(eleme);
    }
    
    public void dibujar(int x,int y,int an,int alto){
       y=0;
       
        super.dibujar(x,y,an,alto);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
    }
}
