package com.enset.customerservice.commands.aggregates;

import com.enset.commonapi.commands.CustomerCommand;
import com.enset.commonapi.events.CustomerEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class CustomerAggregate {
    @AggregateIdentifier
    private String id;
    private String name;
    private String address;
    private String email;
    private String phone;

    @CommandHandler
    public CustomerAggregate(CustomerCommand.CreateCustomer command) {
        AggregateLifecycle.apply(new CustomerEvent.CustomerCreated(
                command.getId(),
                command.getName(),
                command.getAddress(),
                command.getEmail(),
                command.getPhone()
        ));
    }

    @EventSourcingHandler
    public void onCustomerCreated(CustomerEvent.CustomerCreated event) {
        this.id = event.getId();
        this.name = event.getName();
        this.address = event.getAddress();
        this.email = event.getEmail();
        this.phone = event.getPhone();
    }
}
