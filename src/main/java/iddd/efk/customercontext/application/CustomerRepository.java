package iddd.efk.customercontext.application;

import iddd.efk.customercontext.domain.Customer;

import java.util.Set;

public interface CustomerRepository {

    Set<Customer> withCustomerName(String name);

    void save(Customer customer);
}
