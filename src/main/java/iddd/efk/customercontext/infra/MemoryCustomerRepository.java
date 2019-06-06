package iddd.efk.customercontext.infra;

import iddd.efk.customercontext.application.CustomerRepository;
import iddd.efk.customercontext.domain.Customer;

public class MemoryCustomerRepository implements CustomerRepository {

    private Customer customer;

    @Override
    public Customer withCustomerName(String name) {

        return this.customer;

    }

    @Override
    public void save(Customer customer) {
        this.customer = customer;
    }
}
