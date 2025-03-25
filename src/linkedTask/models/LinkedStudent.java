package linkedTask.models;

import linkedTask.linked_db.Linked_DB;

import java.time.LocalDate;

public class LinkedStudent implements Comparable<LinkedStudent> {
    private Long id;
    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
    private double point;
    private String group;

    public LinkedStudent() {
    }

    public LinkedStudent(Long id, String firstName, String email, LocalDate dateOfBirth, double point, String group) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.point = point;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public int compareTo(LinkedStudent o) {
        // BY NAME
//        return this.firstName.compareTo(o.firstName);
        // BY PINT
//        return (int) (this.point - o.point);
        // BY GROUP
        return this.group.compareTo(o.group);
    }

    @Override
    public String toString() {
        return "\nLinkedStudent {" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", email='" + email + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               ", point=" + point +
               ", group='" + group + '\'' +
               " }";
    }
}
