
package fabrica;

public class marcoj extends ventana{
    
    marcoj(String n, int l,int a, char b, char f){
        super(n,l,a,b,f);
    }
    
    @Override
    public void definirla() {
       System.out.print("marco de java definido...\n");
    }

    @Override
    public void mostrarla() {
        System.out.print("mostrando marco de java \n");
    }
    
}
