package com.tanto.SimpleCRUD.controller;

import com.tanto.SimpleCRUD.entity.Product;
import com.tanto.SimpleCRUD.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductServices services;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return services.saveProduct(product);
    }

    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return services.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProduct(){
        return services.getProducts();
    }

    @GetMapping("/product/{id}")
    public  Product findProductById(@PathVariable int id){
        return services.getProductById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return services.deleteProduct(id);
    }
}
