package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ProductService {
    @GetMapping("/v1/product/{productId}")
    public Product getProduct(
            @PathVariable("productId") long productId
    ){
        Product product = new Product();
        product.setId(productId);
        product.setName("상품" + productId);
        return product;

    }

}
