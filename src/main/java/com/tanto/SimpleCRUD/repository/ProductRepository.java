package com.tanto.SimpleCRUD.repository;

import com.tanto.SimpleCRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    Product findByName(String name);
}
