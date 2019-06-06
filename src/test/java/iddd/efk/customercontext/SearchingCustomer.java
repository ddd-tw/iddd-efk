package iddd.efk.customercontext;

import cucumber.api.java8.En;
import iddd.efk.customercontext.application.CustomerAppService;
import iddd.efk.customercontext.application.CustomerRepository;
import iddd.efk.customercontext.domain.Customer;
import iddd.efk.customercontext.infra.MemoryCustomerRepository;

import static org.junit.Assert.*;

public class SearchingCustomer implements En {

    private Customer customer;
    private CustomerRepository customerRepository = new MemoryCustomerRepository();

    public SearchingCustomer() {

        Given("^there is a customer named \"([^\"]*)\"$", (String existingCustomerName) -> {
            Customer customer = new Customer(existingCustomerName);
            customerRepository.save(customer);
        });

        When("^I search a customer name \"([^\"]*)\"$", (String targetCustomerName) -> {
            CustomerAppService customerAppService = new CustomerAppService(customerRepository);
            customer = customerAppService.searchCustomer(targetCustomerName);
        });

        Then("^I get a customer with name \"([^\"]*)\"$", (String expectedCustomerName) -> {
            assertEquals(expectedCustomerName, customer.name());
        });

        Then("customer is not presented", () -> {
            // Write code here that turns the phrase above into concrete actions
           assertNull(customer);
        });
    }
}
