
package decorador;

import java.awt.Graphics;

public class panel extends apanel {
    int x=0;
    int y=0;
    int ancho=10;
    int alto=10;
    
    @Override
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
    }
}
