package com.selva.services;

import com.selva.com.selva.models.Employee;
import com.selva.com.selva.models.Projects;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Selva on 4/5/17.
 */
@Component
public class EmployeeService {


    private static List<Employee> employees = new ArrayList<>();
    static {

        Employee emp1 = new Employee(1001,"Selva","Fare Systems", new ArrayList(Arrays.asList(100,"Manila")));
        Employee emp2 = new Employee(1002,"Vasanth","Assets", new ArrayList(Arrays.asList(101,"Singapore")));
        Employee emp3 = new Employee(1003,"Nandy","Planning", new ArrayList(Arrays.asList(102,"Thailand")));
        Employee emp4 = new Employee(1004,"Dylan","Infrastructure", new ArrayList(Arrays.asList(103,"India")));

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
    }
   public List<Employee> retrieveEmployees(){

       return  employees;

   }

    public Employee retrieveEmployee(int empId){

        for (Employee employee : employees) {
            if (employee.getEmpId()==(empId)) {
                return employee;
            }
        }
        return null;

    }
}
