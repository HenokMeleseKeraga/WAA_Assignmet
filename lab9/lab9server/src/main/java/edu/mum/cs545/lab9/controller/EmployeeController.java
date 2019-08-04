package edu.mum.cs545.lab9.controller;

import edu.mum.cs545.lab9.domain.Employee;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeController {
    @CrossOrigin
    @PostMapping("/add")
    public  Employee addEmployee(@Valid @RequestBody Employee employee){
        return employee;
    }
}
