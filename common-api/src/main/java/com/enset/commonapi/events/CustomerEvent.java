package com.enset.commonapi.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public abstract class CustomerEvent {

    @Getter @AllArgsConstructor @NoArgsConstructor
    private abstract static class BaseCustomerEvent {
        private String id;
        private String name;
        private String address;
        private String email;
        private String phone;
    }

    @NoArgsConstructor
    public static class CustomerCreated extends BaseCustomerEvent {
        public CustomerCreated(String id, String name, String address, String email, String phone) {
            super(id, name, address, email, phone);
        }
    }

}
