package com.example.thymeleafcrudproject.manager;

import com.example.thymeleafcrudproject.dao.EmployeeRepository;
import com.example.thymeleafcrudproject.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class EmployeeManagerImpl implements EmployeeManager {
    private final EmployeeRepository employeeRepository;
    @Override
    public List<Employee> employees() {
        var list = this.employeeRepository.findAllByOrderByLastNameAsc();
        return list;
    }

    @Override
    public Employee getById(int id) {
        return this.employeeRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void saveAllEmployees(Collection<Employee> newEmployeesCollection) {
        this.employeeRepository.saveAll(newEmployeesCollection);
    }
}
