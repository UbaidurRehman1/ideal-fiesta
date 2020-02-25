package com.codemaster.okta.employeeinfoservice.feignProxy;

import java.util.List;

import com.codemaster.okta.employeeinfoservice.entity.Person;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-gateway-server")
@RibbonClient(name = "person-info-service")
public interface Proxy 
{
    @GetMapping("person-info-service/person/{id}")
    public Person getPerson(@PathVariable(name = "id") Long id);

    @GetMapping("person-info-service/person/")
    public List<Person> getAll();
}