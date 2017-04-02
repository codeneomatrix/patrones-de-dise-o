package decorador;

public class botonayudadecorador extends ventanadecorador{
    
    botonayudadecorador(ventana decoradorventana){
        super(decoradorventana);
    }
    
    public void dibujar(){
        dibujarbotonayuda();
        decoradorventana.dibujar();
    }
    
    private void dibujarbotonayuda(){
        System.out.println("Boton ayuda");
    }
    
    public String getdescription(){ 
        return decoradorventana.getdescription()+",con boton de ayuda";
    }
}
