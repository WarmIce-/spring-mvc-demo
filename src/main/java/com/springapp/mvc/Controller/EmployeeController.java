package com.springapp.mvc.Controller;

import com.springapp.mvc.DAO.serviceImpl.EmployeeServiceImpl;
import com.springapp.mvc.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Ishwor on 9/20/2016.
 */
@Controller
public class EmployeeController {
    private Logger logger = Logger.getLogger(EmployeeController.class.getName());
    private EmployeeServiceImpl employeeServiceImpl;

    @Autowired
    public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listEmployees() {
        List<Employee> empList = employeeServiceImpl.getItems();
        ModelAndView model = new ModelAndView("index");
        model.addObject("itemList", empList);
        model.addObject("msg", "welcome to spring mvc");
        logger.info("check value from database:" + empList.get(0).getItemName());
        return model;
    }
}
