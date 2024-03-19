package io.github.oengajohn.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.oengajohn.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    
}
