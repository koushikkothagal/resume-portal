package io.javabrains.resumeportal.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private int theme;
    private String summary;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String designation;

    @OneToMany(cascade = CascadeType.ALL,
        orphanRemoval = true)
    @JoinColumn(name = "job_id")
    List<Job> jobs = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "education_id")
    List<Education> educations = new ArrayList<>();

    @ElementCollection(targetClass=String.class)
    List<String> skills = new ArrayList<>();

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTheme() {
        return theme;
    }

    public void setTheme(int theme) {
        this.theme = theme;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
