
package fabrica;

public class programacc extends programa{

    @Override
    public ventana crearventana(String t) {
        if(t.equals("panel")){
            return new panelc("programa1", 100,80,'*','-');
        } 
        return new marcoc("programa1", 100,80,'*','-');
    }

    @Override
    public void iniciar() {
        System.out.print("iniciando logica del programa en c\n");
    }
    
}
