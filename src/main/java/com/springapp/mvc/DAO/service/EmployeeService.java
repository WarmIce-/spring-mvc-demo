package com.springapp.mvc.DAO.service;

import com.springapp.mvc.Models.Employee;

import java.util.List;

/**
 * Created by Ishwor on 9/20/2016.
 */
public interface EmployeeService {
    public List<Employee> getItems();

    public void insert(Employee item);
}
