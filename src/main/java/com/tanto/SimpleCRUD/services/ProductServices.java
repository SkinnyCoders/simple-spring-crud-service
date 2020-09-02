package com.tanto.SimpleCRUD.services;

import com.tanto.SimpleCRUD.entity.Product;
import com.tanto.SimpleCRUD.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return  repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public  List<Product> getProducts(){
        return  repository.findAll();
    }

    public  Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Berhasil dihapus";
    }

}
