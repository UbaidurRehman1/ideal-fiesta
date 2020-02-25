package com.codemaster.okta.employeeinfoservice.services;
import java.util.List;

import com.codemaster.okta.employeeinfoservice.entity.Employee;

public interface EmployeeService 
{
    public Employee findOne(Long id);
    public List<Employee> findAll();
}