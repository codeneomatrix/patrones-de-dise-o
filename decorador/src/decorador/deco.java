
package decorador;

import java.awt.Graphics;

public abstract class deco extends apanel{
    private apanel elemento;
    
    deco(apanel eleme){
        elemento=eleme;
    }
    
    public void dibujar(int x,int y,int an,int alto){
        elemento.dibujar(x,y,an,alto);
    }
   
    @Override
    public void paint(Graphics g){
        elemento.paint(g);
        
    }
}
