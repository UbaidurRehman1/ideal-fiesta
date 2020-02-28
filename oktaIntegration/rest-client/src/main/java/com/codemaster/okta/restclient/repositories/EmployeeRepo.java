package com.codemaster.okta.restclient.repositories;

import com.codemaster.okta.restclient.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>
{

}