package com.azure.appService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azure.appService.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
