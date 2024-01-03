package Assignment2;


import java.util.*;

public class Trainer {
    private int trainerId;
    private String name;
    private String email;
    private long contactNumber;
    private List<TechStack> techStack;

    public Trainer(int trainerId, String name, String email, long contactNumber, List<TechStack> techStack) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.techStack = techStack;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public List<TechStack> getTechStack() {
        return techStack;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setTechStack(List<TechStack> techStack) {
        this.techStack = techStack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId, name, email, contactNumber, techStack);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trainer trainer = (Trainer) obj;
        return trainerId == trainer.trainerId &&
                contactNumber == trainer.contactNumber &&
                Objects.equals(name, trainer.name) &&
                Objects.equals(email, trainer.email) &&
                Objects.equals(techStack, trainer.techStack);
    }
}
