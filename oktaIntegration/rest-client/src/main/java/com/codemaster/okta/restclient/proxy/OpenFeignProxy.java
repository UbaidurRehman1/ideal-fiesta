package com.codemaster.okta.restclient.proxy;


import java.util.List;

import com.codemaster.okta.restclient.entity.Employee;
import com.codemaster.okta.restclient.entity.User;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("api-gateway-server")
@RibbonClients({
    @RibbonClient("employee-info-service"),
    @RibbonClient("authUsers")
})
public interface OpenFeignProxy 
{
    @GetMapping("employee-info-service/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Long id);

    @GetMapping("employee-info-service/employee")
    public List<Employee> getEmployees();

    @GetMapping("authUsers/username")
    public User getUser(@PathVariable("username") String username);
}