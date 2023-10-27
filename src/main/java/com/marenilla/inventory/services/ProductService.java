package com.marenilla.inventory.services;

import com.marenilla.inventory.api.dto.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
}
