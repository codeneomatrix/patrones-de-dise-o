/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.producto.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.edu.itoaxaca.producto.modelo.PurchaseOrder;

/**
 *
 * @author acer
 */
@Stateless
public class PurchaseOrderFacade extends AbstractFacade<PurchaseOrder> {
    @PersistenceContext(unitName = "Producto-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PurchaseOrderFacade() {
        super(PurchaseOrder.class);
    }
    
}
