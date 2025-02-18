package com.amine_ezzahi.spring_ioc.service;

import com.amine_ezzahi.spring_ioc.dao.IDaoProduct;
import com.amine_ezzahi.spring_ioc.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IServiceProduct<Long, Produit> {


    private IDaoProduct dao;
    public ProductService(IDaoProduct dao){
        this.dao = dao;
    }

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
