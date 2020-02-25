package com.codemaster.okta.PersonInfo.Controller;

import java.util.List;

import com.codemaster.okta.PersonInfo.entity.Person;
import com.codemaster.okta.PersonInfo.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController 
{

    @Autowired
    PersonService personService;

    @GetMapping("person/{id}")
    public Person findOne(@PathVariable(value = "id") Long id)
    {
        return personService.findOne(id);
    }

    @GetMapping("person")
    public List<Person> getAll()
    {
        return  personService.findAll();
    }
}