package com.dainy33.practice.service;

import com.dainy33.practice.entity.Employee;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface EmployeeManager {
    public void addEmployee(Employee employee);
    public List<Employee> getEmployee();
}
/**
 * @program: webServiceDemo
 * @description:
 * @author: Dainy33
 * @create: 2018-12-29 16:03
 **/
