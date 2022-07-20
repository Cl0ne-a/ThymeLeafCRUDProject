package com.example.thymeleafcrudproject;

import com.example.thymeleafcrudproject.entity.Employee;
import com.example.thymeleafcrudproject.manager.EmployeeManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

@RequiredArgsConstructor
@Component
public class MorningCheckIns {

    private final EmployeeManager employeeManager;

    @PostConstruct
    private void letEmployeesIn() {
        Employee e1 = new Employee().setId(1).setFirstName("Lana").setLastName("Rais").setEmail("lana@gmail.com");
        Employee e2 = new Employee().setId(2).setFirstName("Dusty").setLastName("Greg").setEmail("dusty@gmail.com");
        Employee e3 = new Employee().setId(3).setFirstName("Ched").setLastName("Kennigh").setEmail("ched@gmail.com");
        Employee e4 = new Employee().setId(4).setFirstName("Dell").setLastName("Latitude").setEmail("dell@gmail.com");

        Collection<Employee> newList = List.of(e1, e2, e3, e4);
        employeeManager.saveAllEmployees(newList);
    }
}
