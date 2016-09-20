package com.springapp.mvc.Controller;

import com.springapp.mvc.DAO.serviceImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
        return null;
    }
}
