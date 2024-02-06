package com.project.api.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.api.model.Employee;
import com.project.api.repository.EmployeeRepository;
import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor
public class EmployeeServiceImplem implements EmployeeService {


    private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long employeeId) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
		return optionalEmployee.get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee existingUser = employeeRepository.findById(employee.getId()).get();
        existingUser.setFirstName(employee.getFirstName());
        existingUser.setLastName(employee.getLastName());
        existingUser.setMail(employee.getMail());
        Employee updatedUser = employeeRepository.save(existingUser);
        return updatedUser;
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
	}



}