package iddd.efk.projectcontext;

import iddd.efk.customercontext.Customer;
import iddd.efk.freelancercontext.Freelancer;

public class Project {

    private Customer customer;
    private Freelancer freelancer;

    public Project(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void assignTo(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public Freelancer getFreelancer() {
        return this.freelancer;
    }
}
