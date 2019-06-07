package iddd.efk.customercontext.application;

import iddd.efk.customercontext.domain.Customer;

import java.util.Set;

public class CustomerAppService {

    private final CustomerRepository customerRepository;

    public CustomerAppService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Set<Customer> searchCustomer(String name) {
        return this.customerRepository.withCustomerName(name);
    }
}
