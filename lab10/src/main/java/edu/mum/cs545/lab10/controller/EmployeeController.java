package edu.mum.cs545.lab10.controller;

import edu.mum.cs545.lab10.domain.Employee;
import edu.mum.cs545.lab10.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/")
    public String getEmployeeForm(@ModelAttribute("employee") Employee employee){
        return "EmployeeForm";
    }
    @PostMapping("/add")
    public String addEmployee(Employee employee){
        employeeService.save(employee);
        return "redirect:/DetailForm";
    }
    @GetMapping("/DetailForm")
    public String employeeDetail(Model model){
        model.addAttribute("allemp",employeeService.getAllEmployee());
        return "DetailForm";
    }
}
