package com.crud.springbootcrudapp.entity;

import javax.persistence.*;


@Entity
@Table(name="employee")
public class Employee {

    @Id
    @Column(name="employee_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long employeeId;

    @Column(name="first_name")
    private String firstName;


    @Column(name="last_name")
    private String lastName;

    @Column(name="building")
    private String building;

    @Column(name="division")
    private String division;

    @Column(name="room")
    private String room;


    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
