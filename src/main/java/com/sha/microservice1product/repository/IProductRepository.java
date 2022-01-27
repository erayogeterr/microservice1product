package com.sha.microservice1product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sha.microservice1product.model.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
