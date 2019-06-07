package iddd.efk.customercontext.application;

import iddd.efk.customercontext.domain.Customer;

import java.util.HashSet;

public class CustomerAppService {

    private CustomerRepository customerRepository;

    public CustomerAppService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public HashSet<Customer> searchCustomer(String name) {
        return this.customerRepository.withCustomerName(name);
    }
}
