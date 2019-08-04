package edu.mum.cs545.lab9client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class EmployeeControllerClient {

    @GetMapping("/")
    public String getEmployeeForm(){
        return "EmployeeForm";
    }

}
