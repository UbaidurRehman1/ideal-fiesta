package com.codemaster.okta.restclient.services;

import com.codemaster.okta.restclient.entity.Employee;
import com.codemaster.okta.restclient.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService
{
    private EmployeeRepo repo;

    public EmployeeServiceImp(@Autowired EmployeeRepo repo) {
        this.repo = repo;
    }

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