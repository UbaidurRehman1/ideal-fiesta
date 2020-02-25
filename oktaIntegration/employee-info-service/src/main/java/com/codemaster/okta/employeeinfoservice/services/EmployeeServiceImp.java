package com.codemaster.okta.employeeinfoservice.services;

import java.util.List;

import com.codemaster.okta.employeeinfoservice.entity.Employee;
import com.codemaster.okta.employeeinfoservice.repositories.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService
{

    @Autowired
    EmployeeRepo repo;

    @Override
    public Employee findOne(Long id)
    {
        return repo.getOne(id);
    }

    @Override
    public List<Employee> findAll()
    {
        return repo.findAll();
    }

}