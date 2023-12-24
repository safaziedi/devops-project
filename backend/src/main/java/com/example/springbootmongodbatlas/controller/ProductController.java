package com.example.springbootmongodbatlas.controller;

import com.example.springbootmongodbatlas.entity.Product;
import com.example.springbootmongodbatlas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/tutorials")
    public List<Product> getProducts() {
       return productService.getProducts();
    }

    @PostMapping("/tutorials")
    public Product insert(@RequestBody Product product){
        return  productService.addProduct(product);
    }

    @PutMapping("/tutorials/{id}")
   public Product update(@PathVariable int id,@RequestBody Product product ){
       return productService.updateProduct(id,product);
    }

    @DeleteMapping("/tutorials/{id}")
    public Product delete(@PathVariable int id ){

        return  productService.deleteProduct(id);
    }
}
