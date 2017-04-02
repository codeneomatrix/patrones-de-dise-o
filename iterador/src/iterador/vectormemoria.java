
package iterador;

public class vectormemoria implements agregado {
    public int[] _datos;

    public vectormemoria(int valores){ 
        _datos = new int[valores];
        for (int i = 0; i < _datos.length; i++){
            _datos[i] = 0; 
        }
    }    
    
    @Override
    public int getValor(int pos){ 
        return _datos[pos]; 
    }
    
    @Override
    public void colocar(int pos, int valor) {
        _datos[pos] = valor; 
    }

    @Override
    public int dimension(){ 
        return _datos.length; 
    }
    
    @Override
    public iiterador creariterador(){
        return new iteradorconcreto(this); 
    }

    

}
