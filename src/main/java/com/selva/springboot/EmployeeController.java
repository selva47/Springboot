package com.selva.springboot;

import com.selva.com.selva.models.Employee;
import com.selva.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Selva on 4/5/17.
 */
@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService empService;

    @GetMapping("/empDetails/employees")
    public List<Employee> retrieveStaffs() {
        return empService.retrieveEmployees();
    }


    @GetMapping("/empDetails/{empId}")
    public Employee retrieveStaffById(@PathVariable int empId) {
        return empService.retrieveEmployee(empId);
    }
}
