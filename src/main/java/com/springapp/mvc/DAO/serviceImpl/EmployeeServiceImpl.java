package com.springapp.mvc.DAO.serviceImpl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.springapp.mvc.DAO.service.EmployeeService;
import com.springapp.mvc.Models.Employee;
import com.springapp.mvc.RowMapper.EmployeeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

/**
 * Created by Ishwor on 9/20/2016.
 */
public class EmployeeServiceImpl extends JdbcTemplate implements EmployeeService {


    @Autowired
    private DataSource dataSource;


    private JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }


    @Override
    public List<Employee> getItems() {
        String sql = "SELECT * FROM Employee";
        List<Employee> employeeList = getJdbcTemplate().query(sql, new EmployeeRowMapper());
        return employeeList;
    }

    @Override
    public void insert(Employee item) {
        String sql = "INSERT INTO Employee values(?,?,?)";
        Long id = item.getItemId();
        String name = item.getItemName();
        Double price = item.getItemPrice();

        // define query arguments
        Object[] args = {id, name, price};

        // define SQL types of the arguments
        int[] types = new int[]{Types.BIGINT, Types.VARCHAR, Types.DOUBLE};

        // execute insert query to insert the data
        // return number of row / rows processed by the executed query
        int row = getJdbcTemplate().update(sql, args, types);
        System.out.println(row + " row inserted.");
    }

    @Override
    public Employee getEmployeeById(int empId) {
        Object[] args = {empId};
        String sql = "SELECT * FROM Employee WHERE ID = ?";
        Employee employee = getJdbcTemplate().queryForObject(sql, new EmployeeRowMapper(), args);
        return employee;
    }


}
