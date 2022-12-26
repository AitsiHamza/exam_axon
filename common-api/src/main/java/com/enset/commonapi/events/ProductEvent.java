package com.enset.commonapi.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public abstract class ProductEvent {

    @Getter @AllArgsConstructor @NoArgsConstructor
    private abstract static class BaseProductEvent {
        private String id;
        private String name;
        private double price;
        private Long quantity;
    }

    @NoArgsConstructor
    public static class ProductCreated extends BaseProductEvent {
        public ProductCreated(String id, String name, double price,Long quantity) {
            super(id, name, price,quantity);
        }
    }

}
