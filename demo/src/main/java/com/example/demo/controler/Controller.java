package com.example.demo.controler;


import com.example.demo.model.Employee;
import com.example.demo.repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class Controller {

    @Autowired
    private Repository repo;

    @GetMapping("/employee/{id}")
    Employee getEmployee(@PathVariable(value = "id") Integer id) {
        return repo.getById(id);
    }

    @GetMapping("/employees")
    List<Employee> getEmployees() {
        return repo.findAll();
    }


}
