package com.amine_ezzahi.spring_ioc.service;

import com.amine_ezzahi.spring_ioc.dao.IDaoProuit;
import com.amine_ezzahi.spring_ioc.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IServiceProduit<Long, Produit>{
    @Autowired
    private IDaoProuit dao;

    @Override
    public void addProduit(Produit p) {
        dao.add(p);
    }

    @Override
    public Produit getProduitById(Long id) {
        return (Produit)dao.getById(id);
    }

    @Override
    public List<Produit> getAllProducts() {
        return dao.getAll();
    }

    @Override
    public void removeProduct(Long id) {
        dao.remove(id);
    }

    @Override
    public void updateProduct(Long id, Produit p) {
        dao.update(id,p);
    }
}
