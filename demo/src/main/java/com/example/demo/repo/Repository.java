package com.example.demo.repo;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Employee, Integer> {


}
