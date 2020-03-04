package com.codemaster.okta.restclient.controller;

import java.util.List;

import com.codemaster.okta.restclient.entity.Employee;
import com.codemaster.okta.restclient.services.EmployeeService;
import com.codemaster.okta.restclient.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class Controller
{
    PersonService personService;
    EmployeeService employeeService;


    public Controller(@Autowired PersonService personService,
                      @Autowired EmployeeService employeeService)
    {
        this.personService = personService;
        this.employeeService = employeeService;
    }

    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable("id") Long id)
    {
        return employeeService.findOne(id);
    }

    @GetMapping("employee")
    public List<Employee> getEmployees()
    {
        return employeeService.findAll();
    }
}