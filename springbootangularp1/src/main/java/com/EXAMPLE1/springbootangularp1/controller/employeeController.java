package com.EXAMPLE1.springbootangularp1.controller;

import com.EXAMPLE1.springbootangularp1.entity.Employee;
import com.EXAMPLE1.springbootangularp1.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class employeeController {
    @Autowired
    private employeeService employeeService;
    @PostMapping("/add")
    public Employee addDetails(@RequestBody Employee employee){
        return employeeService.addDetails(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/id/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/name/{name}")
    public Employee getEmployeeByName(@PathVariable String name){
        return employeeService.getEmployeeByName(name);
    }

    @PutMapping("/put/{id}")
    public Employee updateEmployeeByName(@RequestBody Employee employee) {
        return employeeService.updateEmployeeByName(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        return employeeService.deleteById(id);
    }

}
