package com.codemaster.okta.restclient.services;


import com.codemaster.okta.restclient.entity.Person;

import java.util.List;

public interface PersonService 
{
    public Person findOne(Long id);
    public List<Person> findAll();
}