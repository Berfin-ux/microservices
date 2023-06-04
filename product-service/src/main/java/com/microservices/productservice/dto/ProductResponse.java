package com.microservices.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private int id;
    private String productTitle;
    private String imageUrl;
    private String sku;
    private int priceUnit;
    private int quantity;
    public String category;//Category olcak tipi
}
