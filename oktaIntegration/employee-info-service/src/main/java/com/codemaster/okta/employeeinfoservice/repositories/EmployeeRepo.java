package com.codemaster.okta.employeeinfoservice.repositories;

import com.codemaster.okta.employeeinfoservice.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>
{

}