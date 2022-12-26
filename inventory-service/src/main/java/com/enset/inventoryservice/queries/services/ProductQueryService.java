package com.enset.inventoryservice.queries.services;

import com.enset.commonapi.events.ProductEvent;
import com.enset.commonapi.queries.CustomerQuery;
import com.enset.inventoryservice.queries.entities.Product;
import com.enset.inventoryservice.queries.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ProductQueryService {
    private ProductRepository productRepository;


    @QueryHandler
    public List<Product> getAllCustomers(CustomerQuery.GetAllCustomers query) {
        return productRepository.findAll();
    }


}
