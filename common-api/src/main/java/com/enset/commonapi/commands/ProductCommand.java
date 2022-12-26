package com.enset.commonapi.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public abstract class ProductCommand {

    @Getter @AllArgsConstructor @NoArgsConstructor
    private abstract static class BaseProductCommand {
        private String id;
        private String name;
        private double price;
        private Long quantity;
    }

    @NoArgsConstructor
    public static class CreateProduct extends BaseProductCommand {
        public CreateProduct(String id, String name, double price,Long quantity) {
            super(id, name, price,quantity);
        }
    }

}
