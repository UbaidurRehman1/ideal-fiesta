package com.codemaster.okta.PersonInfo.services;

import java.util.List;

import com.codemaster.okta.PersonInfo.entity.Person;

public interface PersonService 
{
    public Person findOne(Long id);
    public List<Person> findAll();
}