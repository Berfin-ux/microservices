package com.microservices.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItemsDto {
    private long id;
    private String skuCode;
    private double price;
    private int quantity;
}
