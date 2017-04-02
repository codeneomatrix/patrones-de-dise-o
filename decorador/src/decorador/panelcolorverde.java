
package decorador;

import java.awt.Color;
import java.awt.Graphics;

public class panelcolorverde extends deco{
    
    
    panelcolorverde(apanel eleme){
        super(eleme);
    }
    
    public void dibujar(int x,int y,int an,int alto){
        
        super.dibujar(x,y,an,alto);
    }
    
    
     @Override
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        super.paint(g);
        
    }
}
