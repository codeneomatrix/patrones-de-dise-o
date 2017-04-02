
package decorador;

import java.awt.Graphics;

public class aplastar extends deco{
    
    aplastar(apanel eleme){
        super(eleme);
    }
    
    public void dibujar(int x,int y,int an,int alto){
       alto=1;
       
        super.dibujar(x,y,an,alto);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
    }
}
