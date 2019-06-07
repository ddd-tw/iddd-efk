package iddd.efk.customercontext.infra;

import iddd.efk.customercontext.application.CustomerRepository;
import iddd.efk.customercontext.domain.Customer;

import java.util.HashSet;

public class MemoryCustomerRepository implements CustomerRepository {

    private HashSet<Customer> customers = new HashSet<>();

    @Override
    public HashSet<Customer> withCustomerName(String name) {

        HashSet<Customer> customersWithName = new HashSet<>();

        for(Customer customer: this.customers) {

            if (name.equals(customer.name())) {
                customersWithName.add(customer);
            }

        }

        return customersWithName;
    }

    @Override
    public void save(Customer customer) {
        this.customers.add(customer);
    }
}
