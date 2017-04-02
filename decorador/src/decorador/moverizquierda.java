
package decorador;

import java.awt.Graphics;

public class moverizquierda extends deco{
    
    moverizquierda(apanel eleme){
        super(eleme);
    }
    
    public void dibujar(int x,int y,int an,int alto){
       x=0;
       
        super.dibujar(x,y,an,alto);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
    }
}
