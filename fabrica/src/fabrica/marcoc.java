
package fabrica;

public class marcoc extends ventana{
    
    marcoc(String n, int l,int a, char b, char f){
        super(n,l,a,b,f);
    }
    
    @Override
    public void definirla() {
       System.out.print("marco de c definido...\n");
    }

    @Override
    public void mostrarla() {
        System.out.print("mostrando marco de c \n");
    }
    
}
