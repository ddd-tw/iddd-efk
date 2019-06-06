package iddd.efk.projectcontext;

import iddd.efk.customercontext.domain.Customer;
import iddd.efk.freelancercontext.CommuicationChannelType;
import iddd.efk.freelancercontext.CommunicationChannel;
import iddd.efk.freelancercontext.Freelancer;
import iddd.efk.freelancercontext.Location;
import org.junit.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.Assert.*;

public class ProjectTest {

    @Test
    public void testProjectCreateByCustomer() {

        Customer customer = new Customer("Bob");
        Project project = new Project(customer);

        assertEquals(customer, project.getCustomer());
    }

    @Test
    public void testAssignToFreelancer() {

        Customer customer = new Customer("Bob");
        Project project = new Project(customer);

        Freelancer freelancer = new Freelancer(
                UUID.randomUUID(),
                "name",
                "email",
                "password",
                new CommunicationChannel(
                        CommuicationChannelType.EMAIL,
                        "xxx@mail.com"
                ),
                new Location("Taiwan", "Taipei", "xxx", "123"),
                new ArrayList<Project>()

//                    CommunicationChannel communicationChannel, Location location, ArrayList<Project> projects) {
        );
        project.assignTo(freelancer);

        assertEquals(freelancer, project.getFreelancer());
    }
}