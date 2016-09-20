package com.springapp.mvc.RowMapper;

import com.springapp.mvc.Models.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;


/**
 * Created by Ishwor on 9/20/2016.
 */
public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int thisRow) {

        Employee employee = null;
        try {
            employee = new Employee();
            employee.setItemId(resultSet.getLong("itemId"));
            employee.setItemPrice(resultSet.getDouble("itemPrice"));
            employee.setItemName(resultSet.getString("itemName"));
        } catch (Exception e) {
            return employee;
        }
        return employee;
    }
}
