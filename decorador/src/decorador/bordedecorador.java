package decorador;

public class bordedecorador extends ventanadecorador{
    
    bordedecorador(ventana decoradorventana ){
        super(decoradorventana);
    }
    public void dibujar(){
        dibujarborde();
        decoradorventana.dibujar();
    }
    
    private void dibujarborde(){
        System.out.println("Borde");
    }
    
    public String getdescription(){ 
        return decoradorventana.getdescription()+",con borde";
    }
}
