package iddd.efk.projectcontext;

import iddd.efk.customercontext.Customer;
import iddd.efk.freelancercontext.Freelancer;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProjectTest {

    @Test
    public void testProjectCreateByCustomer() {

        Customer customer = new Customer();
        Project project = new Project(customer);

        assertEquals(customer, project.getCustomer());
    }

    @Test
    public void testAssignToFreelancer() {

        Customer customer = new Customer();
        Project project = new Project(customer);

        Freelancer freelancer = new Freelancer();
        project.assignTo(freelancer);

        assertEquals(freelancer, project.getFreelancer());
    }
}