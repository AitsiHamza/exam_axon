package com.enset.inventoryservice.queries.repositories;

import com.enset.inventoryservice.queries.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
