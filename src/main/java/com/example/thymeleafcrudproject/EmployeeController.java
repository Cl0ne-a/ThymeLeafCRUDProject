package com.example.thymeleafcrudproject;

import com.example.thymeleafcrudproject.entity.Employee;
import com.example.thymeleafcrudproject.manager.EmployeeManager;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/departmant")
public class EmployeeController {

    private final EmployeeManager employeeManager;

    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        var employees = employeeManager.employees();
        model.addAttribute("employees", employees);
        return "list";
    }
}
