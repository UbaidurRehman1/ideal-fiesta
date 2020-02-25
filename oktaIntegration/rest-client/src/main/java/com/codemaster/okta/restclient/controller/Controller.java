package com.codemaster.okta.restclient.controller;

import java.util.List;

import com.codemaster.okta.restclient.entity.Employee;
import com.codemaster.okta.restclient.proxy.OpenFeignProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class Controller
{
    @Autowired
    OpenFeignProxy proxy;

    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable("id") Long id)
    {
        Employee employee = proxy.getEmployee(id);
        System.out.println(employee);
        return employee;
    }

    @GetMapping("employee")
    public List<Employee> getEmployees()
    {
        return proxy.getEmployees();
    }
}