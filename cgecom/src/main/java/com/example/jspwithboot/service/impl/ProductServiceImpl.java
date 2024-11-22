package com.example.jspwithboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.jspwithboot.model.Product;
import com.example.jspwithboot.repositories.ProductRepository;
import com.example.jspwithboot.service.iface.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        }
        throw new RuntimeException("Product not found with ID: " + id);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

	/*
	 * @Override public void updateProductStock(int productId, int quantity) {
	 * Product product = getProductById(productId); // int updatedStock =
	 * product.getStock() - quantity; if (updatedStock < 0) { throw new
	 * RuntimeException("Insufficient stock for product ID: " + productId); } //
	 * product.setStock(updatedStock); productRepository.save(product); }
	 */
}
