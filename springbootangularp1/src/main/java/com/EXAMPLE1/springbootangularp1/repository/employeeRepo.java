package com.EXAMPLE1.springbootangularp1.repository;

import com.EXAMPLE1.springbootangularp1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface employeeRepo extends JpaRepository <Employee,Integer> {
    Optional<Employee> findByName(String name);
}
