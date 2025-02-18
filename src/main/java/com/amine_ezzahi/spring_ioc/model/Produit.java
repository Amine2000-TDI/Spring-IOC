package com.amine_ezzahi.spring_ioc.model;

import lombok.*;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
public class Produit {
    private Long id;
    private String name;
    private String description;
    private Double pric;
    private Double quantity;
}
