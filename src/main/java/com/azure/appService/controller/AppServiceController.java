package com.azure.appService.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.appService.Repository.EmployeeRepository;
import com.azure.appService.entity.Employee;
@RestController
@RequestMapping("/api")
public class AppServiceController {

	@Autowired 
	private EmployeeRepository empRepo;
    @GetMapping("/message")
    public ResponseEntity<String> getStatus() {
        System.out.println("Request received at /Message endpoint");
        return ResponseEntity.ok("Welcome to Azure App Service Updated with db!");
    }
    
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
    	
    	return empRepo.findAll();
    	
    }
    
    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee emp) {
    	return empRepo.save(emp);
    }
}