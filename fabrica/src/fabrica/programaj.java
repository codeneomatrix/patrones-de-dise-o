
package fabrica;

public class programaj extends programa{

    @Override
    public ventana crearventana(String t) {
        if(t.equals("panel")){
            return new panelj("programa1", 100,80,'*','-');
        } 
        return new marcoj("programa1", 100,80,'*','-');
    }

    @Override
    public void iniciar() {
        System.out.print("iniciando logica del programa en java\n");
    }
    
}