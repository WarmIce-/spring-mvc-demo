package com.springapp.mvc.Controller;

import com.springapp.mvc.DAO.serviceImpl.EmployeeServiceImpl;
import com.springapp.mvc.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert(@RequestParam(value = "name") String name, @RequestParam(value = "price") String price) {
        Employee item = new Employee();
        item.setItemName(name);
        item.setItemPrice(Double.valueOf(price));

        employeeServiceImpl.insert(item);

        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("Database_Message", "Data insertion success!! Open you database and confirm!!");
        return modelAndView;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView addPage() {
        ModelAndView model = new ModelAndView("addpage");
        return model;
    }
}
