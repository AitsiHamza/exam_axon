package com.enset.commonapi.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public abstract class CustomerQuery {

    @Getter @AllArgsConstructor @NoArgsConstructor
    private abstract static class BaseCustomerQuery {
        private String id;
        private String name;
        private String address;
        private String email;
        private String phone;
    }

    @NoArgsConstructor
    public static class CreateCustomer extends BaseCustomerQuery {
        public CreateCustomer(String name, String address, String email, String phone) {
            super(null, name, address, email, phone);
        }
    }

    public static class GetAllCustomers {}

}
