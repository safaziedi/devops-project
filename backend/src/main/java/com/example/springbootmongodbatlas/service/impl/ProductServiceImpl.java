package com.example.springbootmongodbatlas.service.impl;

import com.example.springbootmongodbatlas.entity.Product;
import com.example.springbootmongodbatlas.repo.ProductRepo;
import com.example.springbootmongodbatlas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product deleteProduct(int id) {
        Product product = productRepo.findById(id).get();
        productRepo.delete(product);
        return product;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productVar = productRepo.findById(id).get();
        productVar.setName(product.getName());
        productVar.setPrice(product.getPrice());
      productVar.setQuantity(product.getQuantity());
      productRepo.save(productVar);
      return productVar;


    }
}
