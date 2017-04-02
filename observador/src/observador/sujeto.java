/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.util.ArrayList;

/**
 *
 * @author Neomatrix
 */
public interface sujeto {
    public void registrarobservador(observador o,String[] aspecto);
    public void removerobservador(observador o);
    public void notificarobservadores(String aspecto);
}
