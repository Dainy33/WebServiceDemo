package com.dainy33.practice.service.impl;

import com.dainy33.practice.entity.Employee;
import com.dainy33.practice.service.EmployeeManager;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerImpl implements EmployeeManager {
    List<Employee> employeeList = new ArrayList();
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getEmployee() {
        return employeeList;
    }
}
/**
 * @program: webServiceDemo
 * @description:
 * @author: Dainy33
 * @create: 2018-12-29 16:04
 **/
