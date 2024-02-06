package com.project.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.project.api.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}