package com.amine_ezzahi.spring_ioc.dao;

import com.amine_ezzahi.spring_ioc.model.Produit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DaoProduct implements IDaoProduct<Long,Produit> {
    private static List<Produit> produits = new ArrayList<>();
    static{
        produits.add(Produit.builder().id(1L).name("Produit 1").pric(100d).quantity(100d).description("Description 1").build());
        produits.add(Produit.builder().id(2L).name("Produit 2").pric(200d).quantity(200d).description("Description 2").build());
        produits.add(Produit.builder().id(3L).name("Produit 3").pric(300d).quantity(300d).description("Description 3").build());
        produits.add(Produit.builder().id(4L).name("Produit 4").pric(400d).quantity(400d).description("Description 4").build());
    }
    @Override
    public void add(Produit p) {
        produits.add(p);
    }

    @Override
    public Produit getById(Long id) {
        return produits.stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public void remove(Long id) {
        produits.remove(getById(id));
    }

    @Override
    public void update(Long id, Produit p) {
        produits.stream().filter(p1 -> p1.getId().equals(id)).peek(p1->{
            p1.setDescription(p.getDescription());
            p1.setName(p.getName());
            p1.setQuantity(p.getQuantity());
            p1.setPric(p.getPric());
        }).collect(Collectors.toList());
    }
}
