package com.example.jspwithboot.service.iface;

import java.util.List;
import com.example.jspwithboot.model.Product;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(int id);

    void saveProduct(Product product);

    void deleteProduct(int id);

  //  void updateProductStock(int productId, int quantity);
}
