package com.codemaster.okta.restclient.proxy;


import java.util.List;

import com.codemaster.okta.restclient.entity.Employee;
import com.codemaster.okta.restclient.entity.User;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("api-gateway-server")
@RibbonClients({
    @RibbonClient("employee-info-service"),
    @RibbonClient("auth-users-service")
})
public interface OpenFeignProxy 
{
    @GetMapping("employee-info-service/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Long id);

    @GetMapping("employee-info-service/employee")
    public List<Employee> getEmployees();

    @GetMapping("auth-users-service/users/{userName}")
    public User getUser(@PathVariable("userName") String username);

    @PostMapping("auth-users-service/users")
    public void saveUser(@RequestBody User user);

    @DeleteMapping("auth-users-service/users")
    public void deleteAll();
}