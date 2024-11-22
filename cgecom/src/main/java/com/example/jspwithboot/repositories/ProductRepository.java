package com.example.jspwithboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jspwithboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {}