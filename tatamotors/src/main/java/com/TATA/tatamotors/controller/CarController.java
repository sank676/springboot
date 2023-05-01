package com.TATA.tatamotors.controller;

import com.TATA.tatamotors.entity.Car;
import com.TATA.tatamotors.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tata")
public class CarController {
    @Autowired
    public CarService carService;
    @PostMapping("/addcars")
    public Car addCar(@RequestBody Car car){
        return carService.addcar(car);
    }
//
//    @PostMapping
//    public List<Employee> saveEmployees(@RequestBody List<Employee> employees){
//        return service.saveEmployees(employees);
//    }
//
////
//    @GetMapping("/{offset}/{limit}")
//    public List<Employee> getEmployees(@PathVariable int offset,@PathVariable int limit) {
//        return service.getEmployees(offset,limit);
//    }
//
//    @GetMapping("/{dept}")
//    public List<Employee> getEmployeesByDept(@PathVariable String dept) {
//        return service.getEmployeesByDept(dept);
//    }
//
//    @GetMapping("/fetch/{dept}/{salary}")
//    public List<Employee> getEmployeesByDeptAndSalary(@PathVariable String dept,@PathVariable double salary) {
//        return service.getEmployeesByDeptAndSalary(dept,salary);
//    }
//
//    @GetMapping("/range/{sal1}/{sal2}")
//    public List<Employee> getEmployeesBySalaryRange(@PathVariable double sal1,@PathVariable double sal2) {
//        return service.getEmployeeBySalaryRange(sal1, sal2);
//    }
//
//    @GetMapping("/min")
//    public Employee getLessPaidEmployee(){
//        return service.minPaidEmp();
//    }
//
//    @PostMapping("/ids")
//    public  List<Employee> getEmployeesByIds(@RequestBody List<Integer> ids){
//        return service.getEmployeesByIds(ids);
//    }
//
//    @GetMapping("/groupByDept")
//    public Map<String, List<Employee>> getEmployeeGroupByDept(){
//        return service.getEmployeeGroupByDept();
//    }

}
