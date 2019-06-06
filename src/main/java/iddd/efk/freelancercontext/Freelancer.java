package iddd.efk.freelancercontext;

import iddd.efk.projectcontext.Project;

import java.util.ArrayList;
import java.util.UUID;

public class Freelancer {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private CommunicationChannel communicationChannel;
    private Location location;
    private ArrayList<Project> projects;

    public Freelancer(UUID id, String name, String email, String password, CommunicationChannel communicationChannel, Location location, ArrayList<Project> projects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.communicationChannel = communicationChannel;
        this.location = location;
        this.projects = projects;
    }

    public static Freelancer create(String name, String email, String password, CommunicationChannel communicationChannel, Location location) {
        UUID id = UUID.randomUUID();
        return new Freelancer(
                id,
                name,
                email,
                password,
                communicationChannel,
                location,
                new ArrayList<Project>()
        );
    }

    public void paidByProject(Project project) throws Exception {
        if (!projects.contains(project)) {
            throw new Exception();
        }
    }

    public void changeCommunicationChannel() {
    }

    public void changeAddress(Location location) {
        this.location = location;
    }

    public void addProduct(Project aProject) {
        this.projects.add(aProject);
    }

    public ArrayList<Project> getProjects() {
        return this.projects;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equalObj = false;
        if (obj != null && this.getClass() == obj.getClass()) {
            Freelancer typedObject = (Freelancer) obj;
            equalObj = this.id.equals(typedObject.id);
        }
        return equalObj;
    }
}
