package com.amine_ezzahi.spring_ioc.dao;

import java.util.List;

public interface IDaoProduct<T,Model>{
    void add(Model m);
    Model getById(T t);
    List<Model> getAll();
    void remove(T t);
    void update(T t,Model m);
}
