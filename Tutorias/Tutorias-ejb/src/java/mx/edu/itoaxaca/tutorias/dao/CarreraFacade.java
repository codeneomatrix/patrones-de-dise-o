/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.tutorias.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.edu.itoaxaca.tutorias.modelo.Carrera;

/**
 *
 * @author acer
 */
@Stateless
public class CarreraFacade extends AbstractFacade<Carrera> {

    @PersistenceContext(unitName = "Tutorias-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CarreraFacade() {
        super(Carrera.class);
    }
    
}
