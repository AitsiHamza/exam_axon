package com.enset.customerservice.queries.services;

import com.enset.commonapi.events.CustomerEvent;
import com.enset.customerservice.queries.entities.Client;
import com.enset.customerservice.queries.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class CustomerEventHandler {

    private ClientRepository clientRepository;

    @EventHandler
    public void onCustomerCreated(CustomerEvent.CustomerCreated event) {
        Client client = Client.builder()
                .id(event.getId())
                .name(event.getName())
                .address(event.getAddress())
                .email(event.getEmail())
                .phone(event.getPhone())
                .build();
        clientRepository.save(client);
    }

}
