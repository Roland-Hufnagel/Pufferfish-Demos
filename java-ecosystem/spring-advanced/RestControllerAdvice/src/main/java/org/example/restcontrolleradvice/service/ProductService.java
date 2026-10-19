package org.example.restcontrolleradvice.service;

import org.example.restcontrolleradvice.exceptions.ProductNotFoundException;
import org.example.restcontrolleradvice.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public Product getProduct(String id) {
        if (id.equals("1")) {
            return new Product("1", "Apple", "Iphone", 1100.0);
        } else {
            throw new ProductNotFoundException(
                    "Product with id " + id + " does not exist");
        }
    }
}
