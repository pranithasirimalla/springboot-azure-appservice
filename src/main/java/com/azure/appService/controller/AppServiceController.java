package com.azure.appService.controller;
import  org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/api")
public class AppServiceController {

    @GetMapping("/message")
    public ResponseEntity<String> getStatus() {
        System.out.println("Request received at /Message endpoint");
        return ResponseEntity.ok("Welcome to Azure App Service!");
    }
}