package com.amine_ezzahi.spring_ioc.service;

import java.util.List;

public interface IServiceProduct<T,Model>{
    void addProduit(Model m);
    Model getProduitById(T t);
    List<Model> getAllProducts();
    void removeProduct(T t);
    void updateProduct(T t,Model m);
}
