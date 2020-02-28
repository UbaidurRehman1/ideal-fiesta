package com.codemaster.okta.restclient.services;


import com.codemaster.okta.restclient.entity.Employee;
import java.util.List;

public interface EmployeeService 
{
    public Employee findOne(Long id);
    public List<Employee> findAll();
}