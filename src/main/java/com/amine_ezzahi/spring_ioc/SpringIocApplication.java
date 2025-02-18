package com.amine_ezzahi.spring_ioc;


import com.amine_ezzahi.spring_ioc.model.Produit;
import com.amine_ezzahi.spring_ioc.service.IServiceProduct;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.amine_ezzahi.spring_ioc")
public class SpringIocApplication {

	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(SpringIocApplication.class);
		IServiceProduct produitservice = app.getBean(IServiceProduct.class);
		System.out.println("*******************************get all products **************************");
		produitservice.getAllProducts().forEach(System.out::println);
		System.out.println("******************************* find by id id = 3 **************************");
		System.out.println(produitservice.getProduitById(3L));
		System.out.println("******************************* add product = 5 **************************");
		produitservice.addProduit(Produit.builder().id(5L).name("Produit 5").pric(500d).quantity(500d).description("Description 5").build());
		produitservice.getAllProducts().forEach(System.out::println);
		System.out.println("******************************* updtae product id = 5 value 6 **************************");
		Produit p = Produit.builder().id(5L).name("Produit 6").pric(600d).quantity(600d).description("Description 6").build();
		produitservice.updateProduct(5L,p);
		produitservice.getAllProducts().forEach(System.out::println);
		System.out.println("******************************* delete product = 5 **************************");
		produitservice.removeProduct(5L);
		produitservice.getAllProducts().forEach(System.out::println);
	}

}
