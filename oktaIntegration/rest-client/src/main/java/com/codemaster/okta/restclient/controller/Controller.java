package com.codemaster.okta.restclient.controller;

import java.util.List;

import com.codemaster.okta.restclient.entity.Employee;
import com.codemaster.okta.restclient.proxy.OpenFeignProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class Controller
{
    @Autowired
    OpenFeignProxy proxy;

    @GetMapping("employee/{id}")
    public Employee getEmployee(Long id)
    {
        return proxy.getEmployee(id);
    }

    @GetMapping("employee")
    public List<Employee> getEmployees()
    {
        return proxy.getEmployees();
    }
}