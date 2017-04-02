
package fabrica;

public class panelc extends ventana{
    
    panelc(String n, int l,int a, char b, char f){
        super(n,l,a,b,f);
    }
    
    @Override
    public void definirla() {
       System.out.print("panel de c definido...\n");
    }

    @Override
    public void mostrarla() {
        System.out.print("mostrando panel de c \n");
    }
    
}

