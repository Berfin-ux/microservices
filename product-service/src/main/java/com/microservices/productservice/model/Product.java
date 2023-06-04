package com.microservices.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
    @Id
    private int id;
    private String productTitle;
    private String imageUrl;
    private String sku;
    private int priceUnit;
    private int quantity;
    public String category;//Category olcak tipi
}
