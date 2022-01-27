package com.sha.microservice1product.service;

import java.util.List;

import com.sha.microservice1product.model.Product;

public interface IProductService {
	
	Product saveProduct (Product product);
	void deleteProduct (Long productId);
	List<Product> findAllProduct();
}
