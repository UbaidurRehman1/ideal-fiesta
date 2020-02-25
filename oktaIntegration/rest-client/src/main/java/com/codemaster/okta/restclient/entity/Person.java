package com.codemaster.okta.restclient.entity;

import java.sql.Date;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// @Entity
// @Table
// @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Person
{
    private Long id;
    private String name;
    private Integer age;
    private Character gender;
    private Date dob;
    
    public Person(String name, Integer age, Character gender, Date dob) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", dob=" + dob + ", gender=" + gender + ", id=" + id + ", name=" + name + "]";
    }
  
}