package com.sha.microservice1product.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sha.microservice1product.model.Product;
import com.sha.microservice1product.repository.IProductRepository;

@Service // Bussiness Logic-Layer
public class ProductService implements IProductService{
	
	private final IProductRepository productRepository; //CI

	public ProductService(IProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public Product saveProduct(Product product) {
		product.setCreateTime(LocalDateTime.now());
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Long productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}

}
