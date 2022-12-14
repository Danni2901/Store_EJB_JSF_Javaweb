/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sessionbeans;

import com.entities.Product;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ngocd
 */
@Local
public interface ProductFacadeLocal {

    void create(Product product);

    void edit(Product product);

    void remove(Product product);

    Product find(Object id);

    List<Product> findAll();

    List<Product> findRange(int[] range);

    int count();
    
 public List<Product> searchByTitle(String title);
 public List<Product> searchByType(int id);
    
}
