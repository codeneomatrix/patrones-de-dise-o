package decorador;

public abstract class ventanadecorador implements ventana {
    protected ventana decoradorventana;
    
    ventanadecorador(ventana decventana){
        this.decoradorventana=decventana;
    }
    
}
