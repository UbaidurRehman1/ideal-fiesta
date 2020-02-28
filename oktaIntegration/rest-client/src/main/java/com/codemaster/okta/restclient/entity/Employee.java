package com.codemaster.okta.restclient.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee
{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    @JsonIgnoreProperties
    private String password;
    @Column
    private Integer salary;
    @Column
    private String position;
    @Column
    private Integer year;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Person employeeDetail;

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


    public Person getEmployeeDetail() {
        return employeeDetail;
    }

    public void setEmployeeDetail(Person employeeDetail) {
        this.employeeDetail = employeeDetail;
    }

    //    public Employee addPersonalInfo(Person person)
//    {
//        this.setName(person.getName());
//        this.setAge(person.getAge());
//        this.setGender(person.getGender());
//        this.setDob(person.getDob());
//        return this;
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", year=" + year +
                ", employeeDetail=" + employeeDetail +
                '}';
    }
}