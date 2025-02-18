package com.amine_ezzahi.spring_ioc;

import com.amine_ezzahi.spring_ioc.dao.DaoProduct;
import com.amine_ezzahi.spring_ioc.dao.IDaoProduct;
import com.amine_ezzahi.spring_ioc.model.Produit;
import com.amine_ezzahi.spring_ioc.service.IServiceProduct;
import com.amine_ezzahi.spring_ioc.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.amine_ezzahi.spring_ioc")
public class AppConfig {

    @Bean
    public IDaoProduct daoProduct(){
        return new DaoProduct();
    }

    @Bean
    public IServiceProduct productService(IDaoProduct daoProduct){
        return new ProductService(daoProduct);
    }

}
