package com.crud.springbootcrudapp.dto;


public class EmployeeDTO {

    private Long employeeId;

    private String firstName;

    private String lastName;

    private String building;

    private String division;

    private String room;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long employeeId, String firstName, String lastName, String building, String division, String room) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.building = building;
        this.division = division;
        this.room = room;
    }

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
