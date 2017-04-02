package mx.edu.itoaxaca.producto.productoAdmo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.event.ActionEvent;
import mx.edu.itoaxaca.producto.modelo.Product;

/**
 *
 * @author acer
 */
@Named(value = "productoAdmo")
@SessionScoped
public class productoAdmo implements Serializable {
private Product producto;

    public void creaProducto(ActionEvent e){
        producto=new Product();
    }
    public Product getProducto() {
        return producto;
    }

    public void setProducto(Product producto) {
        this.producto = producto;
    }
    /**
     * Creates a new instance of ProductoAdmo
     */

    public productoAdmo() {
    }
    
}
