package iddd.efk.customercontext.infra;

import iddd.efk.customercontext.application.CustomerRepository;
import iddd.efk.customercontext.domain.Customer;

import java.util.HashSet;
import java.util.Set;

public class MemoryCustomerRepository implements CustomerRepository {

    private final Set<Customer> customers = new HashSet<>();

    @Override
    public Set<Customer> withCustomerName(String name) {

        Set<Customer> customersWithName = new HashSet<>();

        for (Customer customer : this.customers) {

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
