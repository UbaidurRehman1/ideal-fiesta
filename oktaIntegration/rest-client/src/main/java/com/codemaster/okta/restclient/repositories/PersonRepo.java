package com.codemaster.okta.restclient.repositories;

import com.codemaster.okta.restclient.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long>
{

}