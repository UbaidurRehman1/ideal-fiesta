package com.codemaster.okta.employeeinfoservice.controller;

import java.util.List;

import com.codemaster.okta.employeeinfoservice.entity.Employee;
import com.codemaster.okta.employeeinfoservice.entity.Person;
import com.codemaster.okta.employeeinfoservice.feignProxy.Proxy;
import com.codemaster.okta.employeeinfoservice.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
    @Autowired
    Proxy proxy;

    @Autowired
    EmployeeService service;

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Long id)
    {
        Person person = proxy.getPerson(id);
        Employee employee = service.findOne(id);
        employee.addPersonalInfo(person);
        return employee;
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee()
    {
        List<Person> persons = proxy.getAll();
        List<Employee> employees = service.findAll();

        for (Employee employee: employees)
        {
            for (Person person: persons)
            {
                if (employee.getId() == person.getId())
                {
                    employee.addPersonalInfo(person);
                }
            }
        }
        return employees;
    }
}