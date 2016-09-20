package com.springapp.mvc.DAO.serviceImpl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.springapp.mvc.DAO.service.EmployeeService;
import com.springapp.mvc.Models.Employee;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by Ishwor on 9/20/2016.
 */
public class EmployeeServiceImpl implements EmployeeService{

    private DataSource dataSource;

    public EmployeeServiceImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Employee> getItems() {
        return null;
    }

    @Override
    public void insert(Employee item) {

    }


}
