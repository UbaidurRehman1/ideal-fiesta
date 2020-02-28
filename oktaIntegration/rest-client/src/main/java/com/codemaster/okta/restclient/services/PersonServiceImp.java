package com.codemaster.okta.restclient.services;

import com.codemaster.okta.restclient.entity.Person;
import com.codemaster.okta.restclient.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService {

    PersonRepo repo;

    public PersonServiceImp(@Autowired PersonRepo repo) {
        this.repo = repo;
    }

    @Override
    public Person findOne(Long id) {
        return repo.getOne(id);
    }

    @Override
    public List<Person> findAll() {
        return repo.findAll();
    }

}