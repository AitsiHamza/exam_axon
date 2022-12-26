package com.enset.inventoryservice.queries.services;

import com.enset.commonapi.events.ProductEvent;
import com.enset.inventoryservice.queries.entities.Product;
import com.enset.inventoryservice.queries.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class ProductEventHandler {
    private ProductRepository productRepository;

    @EventHandler
    public void onProductCreated(ProductEvent.ProductCreated event) {
        Product product=Product.builder()
                .id(event.getId())
                .name(event.getName())
                .quantity(event.getQuantity())
                .price(event.getPrice())
                .build();
        productRepository.save(product);
    }

}
