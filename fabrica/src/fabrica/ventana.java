
package fabrica;

import java.util.ArrayList;

public abstract class ventana {
    String nombre;
    int largo;
    int ancho;
    char borde;
    char fondo; 
    ArrayList elementos;
    ArrayList controles;
    
    ventana(String n, int l,int a, char b, char f){
    nombre=n;
    largo=l;
    ancho=a;
    borde=b;
    fondo=f;     
    }
    public abstract void definirla();
    public abstract void mostrarla();
    
}
