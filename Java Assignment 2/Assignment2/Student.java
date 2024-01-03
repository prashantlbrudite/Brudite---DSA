package Assignment2;

import java.util.*;
public class Student {
    private int studentId;
    private String name;
    private String email;
    private long contactNumber;

    public Student(int studentId, String name, String email, long contactNumber) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }


    // getter methods to access the private variables of class
    public int getId() {
        return this.studentId;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public long getContact() {
        return this.contactNumber;
    }

    // setter methods to access the private variables of the class
    public void setId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, email, contactNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId == student.studentId &&
                contactNumber == student.contactNumber &&
                Objects.equals(name, student.name) &&
                Objects.equals(email, student.email);
    }

}

