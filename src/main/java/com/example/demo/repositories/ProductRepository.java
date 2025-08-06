package com.example.demo.repositories;

import com.example.demo.enteties.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
