package com.enset.customerservice.queries.repositories;

import com.enset.customerservice.queries.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {
}
