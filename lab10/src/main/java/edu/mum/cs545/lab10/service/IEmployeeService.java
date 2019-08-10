package edu.mum.cs545.lab10.service;

import edu.mum.cs545.lab10.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee get(Long id);
    Employee save(Employee employee);
    List<Employee> getAllEmployee();

}
