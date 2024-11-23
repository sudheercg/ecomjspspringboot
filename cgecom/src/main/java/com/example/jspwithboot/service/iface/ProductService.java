package com.example.jspwithboot.service.iface;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.jspwithboot.model.Product;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(int id);

    void saveProduct(Product product);

    void deleteProduct(int id);
    public String saveProductImage(MultipartFile imageFile) throws IOException;

  //  void updateProductStock(int productId, int quantity);
}
