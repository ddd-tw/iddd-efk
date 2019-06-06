package iddd.efk.customercontext.application;

import iddd.efk.customercontext.domain.Customer;

public interface CustomerRepository {

    public Customer withCustomerName(String name);
    public void save(Customer customer);
}
