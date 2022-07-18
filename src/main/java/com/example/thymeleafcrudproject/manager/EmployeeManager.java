package com.example.thymeleafcrudproject.manager;

import com.example.thymeleafcrudproject.entity.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeManager {
    List<Employee> employees();
    Employee getById(int id);
    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void saveAllEmployees(Collection<Employee>newEmployeesCollection);
}
