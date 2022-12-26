package com.enset.customerservice.commands.services;

import com.enset.commonapi.commands.CustomerCommand;
import com.enset.commonapi.queries.CustomerQuery;
import lombok.AllArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
@Transactional
@AllArgsConstructor
public class CustomerCommandService {

    private CommandGateway gateway;

    public CompletableFuture<String> createCustomer(CustomerQuery.CreateCustomer query) {
        return gateway.send(new CustomerCommand.CreateCustomer(
                UUID.randomUUID().toString(),
                query.getName(),
                query.getAddress(),
                query.getEmail(),
                query.getPhone()
        ));
    }

}
