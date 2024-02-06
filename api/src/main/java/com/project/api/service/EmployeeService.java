package com.project.api.service;

import java.util.List;

import com.project.api.model.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long employeeId);

    List<Employee> getAllEmployees();

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long employeeId);

}
