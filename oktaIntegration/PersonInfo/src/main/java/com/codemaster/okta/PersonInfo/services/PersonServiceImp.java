package com.codemaster.okta.PersonInfo.services;

import java.util.List;

import com.codemaster.okta.PersonInfo.entity.Person;
import com.codemaster.okta.PersonInfo.repositories.PersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    PersonRepo repo;

    @Override
    public Person findOne(Long id)
    {
        return repo.getOne(id);
    }

    @Override
    public List<Person> findAll()
    {
        return repo.findAll();
    }

}