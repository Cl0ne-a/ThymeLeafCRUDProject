package com.example.thymeleafcrudproject.dao;

import com.example.thymeleafcrudproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeService extends JpaRepository<Employee, Integer> {
}
