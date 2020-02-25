package com.codemaster.okta.PersonInfo.repositories;

import com.codemaster.okta.PersonInfo.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long>
{

}