package com.codemaster.okta.restclient.controller;

import java.util.List;

import com.codemaster.okta.restclient.entity.Employee;
import com.codemaster.okta.restclient.entity.Person;

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
//        Person person = personService.findOne(id);
        Employee employee = employeeService.findOne(id);
//        employee.addPersonalInfo(person);
        System.out.println("EmployeeController===> " + employee.toString());
        return employee;
    }

    @GetMapping("employee")
    public List<Employee> getEmployees()
    {
//        List<Person> persons = personService.findAll();
        List<Employee> employees = employeeService.findAll();

//        for (Employee employee: employees)
//        {
//            for (Person person: persons)
//            {
//                if ((long) employee.getId() == person.getId())
//                {
////                    employee.addPersonalInfo(person);
//                }
//            }
//        }
        return employees;
    }
}