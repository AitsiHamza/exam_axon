package com.enset.customerservice.queries.controllers;

import com.enset.commonapi.queries.CustomerQuery;
import com.enset.customerservice.queries.entities.Client;
import lombok.AllArgsConstructor;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@CrossOrigin("*")
@RequestMapping("/query/customers")
@AllArgsConstructor
public class CustomerQueryController {

    private QueryGateway gateway;

    @GetMapping
    public CompletableFuture<List<Client>> getAllCustomers() {
        return gateway.query(new CustomerQuery.GetAllCustomers(), ResponseTypes.multipleInstancesOf(Client.class));
    }

}
