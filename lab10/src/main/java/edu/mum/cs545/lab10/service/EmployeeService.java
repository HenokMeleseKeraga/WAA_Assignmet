package edu.mum.cs545.lab10.service;

import edu.mum.cs545.lab10.domain.Employee;
import edu.mum.cs545.lab10.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee get(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>)(employeeRepository.findAll());
    }


}
