package com.TATA.tatamotors.service;

import com.TATA.tatamotors.entity.Car;
import com.TATA.tatamotors.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    public CarRepository carRepository;
    public Car addcar(Car car) {
        return carRepository.save(car);
    }

//    @Autowired
//    private JPAStreamer jpaStreamer;
//
//
//    public List<Employee> saveEmployees(List<Employee> employees) {
//        return repository.saveAll(employees);
//    }
//
//    public List<Employee> getEmployees(int offset,int limit){
//        return jpaStreamer.stream(Employee.class)
//                .sorted(Employee$.name)
//                .skip(offset)
//                .limit(limit)
//                .collect(Collectors.toList());
//    }
//
//    public List<Employee> getEmployeesByDept(String dept){
//        return jpaStreamer.stream(Employee.class)
//                .filter(Employee$.dept.equal(dept))
//                .collect(Collectors.toList());
//    }
//
//    public List<Employee> getEmployeesByDeptAndSalary(String dept,double salary){
//        return jpaStreamer.stream(Employee.class)
//                .filter(Employee$.dept.equal(dept)
//                        .and(Employee$.salary.greaterOrEqual(salary)))
//                .collect(Collectors.toList());
//    }
//
//    public List<Employee> getEmployeeBySalaryRange(double salary1,double salary2){
//        return  jpaStreamer.stream(Employee.class)
//                .filter(Employee$.salary.between(salary1,salary2))
//                .collect(Collectors.toList());
//    }
//
//    //aggregate fun
//
//    public Employee minPaidEmp(){
//        return  jpaStreamer.stream(Employee.class)
//                .min(Comparator.comparing(Employee::getSalary)).get();
//    }
//
//    public List<Employee> getEmployeesByIds(List<Integer> ids){
//        return jpaStreamer.stream(Employee.class)
//                .filter(Employee$.id.in(ids))
//                .collect(Collectors.toList());
//    }
//
//    public Map<String, List<Employee>> getEmployeeGroupByDept(){
//        return jpaStreamer.stream(Employee.class)
//                .collect(Collectors.groupingBy(Employee::getDept));
//    }

}
