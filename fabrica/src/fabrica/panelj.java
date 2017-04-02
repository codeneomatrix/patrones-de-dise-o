
package fabrica;

public class panelj extends ventana{
    
    panelj(String n, int l,int a, char b, char f){
        super(n,l,a,b,f);
    }
    
    @Override
    public void definirla() {
       System.out.print("panel de java definido...\n");
    }

    @Override
    public void mostrarla() {
        System.out.print("mostrando panel de java \n");
    }
    
}
