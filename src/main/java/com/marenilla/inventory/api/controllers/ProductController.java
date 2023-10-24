package com.marenilla.inventory.api.controllers;

import com.marenilla.inventory.api.dto.Product;
import com.marenilla.inventory.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    List<Product> getProducts(){
        return productService.getProducts();
    }

}
