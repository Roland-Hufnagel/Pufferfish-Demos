package org.example.restcontrolleradvice.controller;

import org.example.restcontrolleradvice.exceptions.ProductNotFoundException;
import org.example.restcontrolleradvice.model.Product;
import org.example.restcontrolleradvice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    Product getProduct(@PathVariable String id) {
        return productService.getProduct(id);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleProductNotFoundException(ProductNotFoundException e) {
        return "Comes from local Exception Handler";
    }


}
