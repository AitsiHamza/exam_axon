package com.enset.commonapi.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public abstract class ProductQuery {

    @Getter @AllArgsConstructor @NoArgsConstructor
    private abstract static class BaseProductQuery {
        private String id;
        private String name;
        private double price;
        private Long quantity;
    }

    @NoArgsConstructor
    public static class CreateProduct extends BaseProductQuery {
        public CreateProduct(String id, String name, double price,Long quantity) {
            super(id, name, price,quantity);
        }
    }

    public static class GetAllProducts {}

}
