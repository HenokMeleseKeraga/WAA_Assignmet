package mum.edu.cs545.lab8.controller;

import mum.edu.cs545.lab8.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class EmployeeController {
    @ModelAttribute("employee")
    public Employee getObj(){
        return new Employee();
    }

    @GetMapping({"/","/employeeFrom"})
    public String getEmployeeForm(Model model){
        model.addAttribute("title","Employee Form");
        return "EmployeeForm";
    }
    @PostMapping("/employeeFrom")
    public String processEmployee( Employee employee, BindingResult result, Model model){
        if(result.hasErrors()){
            return "EmployeeForm";
        }
        model.addAttribute("title","Employee detail");
        model.addAttribute("employee",employee);
        return "EmployeeDetails";
    }

}
