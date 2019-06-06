package iddd.efk.customercontext;

import cucumber.api.java8.En;
import iddd.efk.customercontext.application.CustomerAppService;
import iddd.efk.customercontext.application.CustomerRepository;
import iddd.efk.customercontext.domain.Customer;
import iddd.efk.customercontext.infra.MemoryCustomerRepository;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SearchingCustomer implements En {

    private Customer customer;
    private CustomerRepository customerRepository = new MemoryCustomerRepository();

    public SearchingCustomer() {

        Given("^there is a customer named \"([^\"]*)\"$", (String arg0) -> {
            Customer customer = new Customer("Bob");
            customerRepository.save(customer);
        });

        When("^I search a customer name \"([^\"]*)\"$", (String name) -> {
            CustomerAppService customerAppService = new CustomerAppService(customerRepository);
            customer = customerAppService.searchCustomer(name);
        });

        Then("^I get a customer with name \"([^\"]*)\"$", (String expectedName) -> {
            assertEquals(expectedName, customer.name());
        });

        Then("^I won't get any customer$", () -> {
            assertNull(customer);
        });
    }
}
