package com.enset.customerservice.queries.services;

import com.enset.commonapi.queries.CustomerQuery;
import com.enset.customerservice.queries.entities.Client;
import com.enset.customerservice.queries.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CustomerQueryService {

    private ClientRepository repository;

    @QueryHandler
    public List<Client> getAllCustomers(CustomerQuery.GetAllCustomers query) {
        return repository.findAll();
    }

}
