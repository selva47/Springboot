package com.selva.com.selva.models;

import java.util.List;

/**
 * Created by Selva on 4/5/17.
 */
public class Employee {

    public int empId;
    public String name;
    public String department;

    public List<Projects> projects;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public Employee(int empId, String name, String department, List<Projects> projects) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", projects=" + projects +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (department != null ? !department.equals(employee.department) : employee.department != null) return false;
        return projects != null ? projects.equals(employee.projects) : employee.projects == null;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (projects != null ? projects.hashCode() : 0);
        return result;
    }*/
}
