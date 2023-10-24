package com.marenilla.inventory.repository;

import com.marenilla.inventory.api.dto.Product;
import com.marenilla.inventory.services.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product,Long> {

}
