/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sessionbeans;

import com.entities.ProductType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ngocd
 */
@Stateless
public class ProductTypeFacade extends AbstractFacade<ProductType> implements ProductTypeFacadeLocal {

    @PersistenceContext(unitName = "AS_EJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductTypeFacade() {
        super(ProductType.class);
    }
    
}
