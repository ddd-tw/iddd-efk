package iddd.efk.freelancercontext;

import iddd.efk.projectcontext.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Freelancer {
    private final UUID id;
    private final String name;
    private final String email;
    private final String password;
    private final CommunicationChannel communicationChannel;
    private Location location;
    private final List<Project> projects;

    public Freelancer(UUID id, String name, String email, String password, CommunicationChannel communicationChannel, Location location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.communicationChannel = communicationChannel;
        this.location = location;
        this.projects = new ArrayList<>();
    }
    /*
    因為 checkstyle 會阻擋超過 6 個參數的建構法
    這邊想確認 projects 是否應該在創建時帶入
    public Freelancer(UUID id, String name, String email, String password, CommunicationChannel communicationChannel, Location location, ArrayList<Project> projects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.communicationChannel = communicationChannel;
        this.location = location;
        this.projects = projects;
    }
    */

    public static Freelancer create(String name, String email, String password, CommunicationChannel communicationChannel, Location location) {
        UUID id = UUID.randomUUID();
        Freelancer freelancer = new Freelancer(
                id,
                name,
                email,
                password,
                communicationChannel,
                location
        );
        return freelancer;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public CommunicationChannel getCommunicationChannel() {
        return communicationChannel;
    }

    public Location getLocation() {
        return location;
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

    public List<Project> getProjects() {
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

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
