package iddd.efk.customercontext.application;

import iddd.efk.customercontext.domain.Customer;

import java.util.HashSet;

public interface CustomerRepository {

    public HashSet<Customer> withCustomerName(String name);
    public void save(Customer customer);
}
