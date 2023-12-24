package com.example.springbootmongodbatlas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection ="products")
public class Product {
    @Id
    private Integer id ;
    private String name ;
    private double price;
    private Integer quantity;
}
