package com.springapp.mvc.DAO.serviceImpl;

import com.springapp.mvc.DAO.service.EmployeeService;
import com.springapp.mvc.Models.Employee;
import com.springapp.mvc.RowMapper.EmployeeRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Types;
import java.util.List;

/**
 * Created by Ishwor on 9/20/2016.
 */
public class EmployeeServiceImpl extends JdbcTemplate implements EmployeeService {

    private JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
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
        String sql = "INSERT INTO `Employee`(`itemPrice`,`itemName`) VALUES(?,?)";
        String name = item.getItemName();
        Double price = item.getItemPrice();

        // define query arguments
        Object[] args = {price, name};

        // define SQL types of the arguments
        int[] types = new int[]{Types.DOUBLE,Types.VARCHAR};

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
