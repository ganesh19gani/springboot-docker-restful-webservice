package com.ojas.springbootdockerrestfulwebservice.repo;


import com.ojas.springbootdockerrestfulwebservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
