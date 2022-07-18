package com.example.thymeleafcrudproject.manager;

import com.example.thymeleafcrudproject.dao.EmployeeService;
import com.example.thymeleafcrudproject.entity.Employee;
import com.example.thymeleafcrudproject.manager.EmployeeManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class EmployeeManagerImpl implements EmployeeManager {

    private final EmployeeService employeeService;
    @Override
    public List<Employee> employees() {
        var list = this.employeeService.findAll();
        return list;
    }

    @Override
    public Employee getById(int id) {
        Employee employee = this.employeeService.findById(id).orElseThrow();
        return employee;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee employee) {

    }

    @Override
    public void saveAllEmployees(Collection<Employee> newEmployeesCollection) {
        this.employeeService.saveAll(newEmployeesCollection);
    }
}