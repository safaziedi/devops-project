package com.example.springbootmongodbatlas.repo;

import com.example.springbootmongodbatlas.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,Integer> {
}
