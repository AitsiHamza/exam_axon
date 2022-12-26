package com.enset.customerservice.commands.controllers;

import com.enset.commonapi.queries.CustomerQuery;
import com.enset.customerservice.commands.services.CustomerCommandService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@CrossOrigin("*")
@RequestMapping("/cmd/customers")
@AllArgsConstructor
public class CustomerCommandController {

    private CustomerCommandService customerService;

    @PostMapping
    public CompletableFuture<String> createCustomer(@RequestBody CustomerQuery.CreateCustomer query) {
        return this.customerService.createCustomer(query);
    }

}
