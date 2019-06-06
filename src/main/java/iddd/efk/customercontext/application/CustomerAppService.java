package iddd.efk.customercontext.application;

import iddd.efk.customercontext.domain.Customer;

public class CustomerAppService {

    private CustomerRepository customerRepository;

    public CustomerAppService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer searchCustomer(String name) {
        return this.customerRepository.withCustomerName(name);
    }
}
