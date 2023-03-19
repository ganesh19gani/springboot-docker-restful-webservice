package com.ojas.springbootdockerrestfulwebservice.controller;

import com.ojas.springbootdockerrestfulwebservice.model.Employee;
import com.ojas.springbootdockerrestfulwebservice.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controller")
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("/docker")
    public String dockerDemo(){
        return "Dockerizing Spring Boot Application";
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }
}
