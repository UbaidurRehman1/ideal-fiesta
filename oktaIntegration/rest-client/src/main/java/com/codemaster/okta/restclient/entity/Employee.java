package com.codemaster.okta.restclient.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Employee extends Person
{
    private Long id;
    private String username;
    @JsonIgnoreProperties
    private String password;
    private Integer salary;
    private String position;
    private Integer year;

    public Employee(String username, String password, Integer salary, String position, Integer year) {
        this.username = username;
        this.password = password;
        this.salary = salary;
        this.position = position;
        this.year = year;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", password=" + password + ", position=" + position + ", salary=" + salary
                + ", username=" + username + ", year=" + year + "]";
    }

    public Employee addPersonalInfo(Person person)
    {
        this.setName(person.getName());
        this.setAge(person.getAge());
        this.setGender(person.getGender());
        this.setDob(person.getDob());
        return this;
    }
}