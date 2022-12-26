package com.enset.commonapi.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public abstract class CustomerCommand {

    @Getter @AllArgsConstructor @NoArgsConstructor
    private abstract static class BaseCustomerCommand {
        private String id;
        private String name;
        private String address;
        private String email;
        private String phone;
    }

    @NoArgsConstructor
    public static class CreateCustomer extends BaseCustomerCommand {
        public CreateCustomer(String id, String name, String address, String email, String phone) {
            super(id, name, address, email, phone);
        }
    }

}
