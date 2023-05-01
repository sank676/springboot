package com.EXAMPLE1.springbootangularp1.service;

import com.EXAMPLE1.springbootangularp1.entity.Employee;
import com.EXAMPLE1.springbootangularp1.repository.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class employeeService {
    @Autowired
    public employeeRepo repo;
    public Employee addDetails(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public Employee getEmployeeByName(String name) {
        return repo.findByName(name).orElse(null);
    }

    public String deleteById(Integer id) {
         repo.deleteById(id);
         return "deleted";

    }


    public Employee updateEmployeeByName(Employee employee) {
        Employee oldemp = null;
        Optional<Employee> optionalEmployee = repo.findById(employee.getId());
        if(optionalEmployee.isPresent()){
            oldemp=optionalEmployee.get();
            oldemp.setName(employee.getName());
            oldemp.setRole(employee.getRole());
            oldemp.setExperience(employee.getExperience());
            repo.save(oldemp);

        }
        else{
            return new Employee();
        }
        return oldemp;
    }
}
