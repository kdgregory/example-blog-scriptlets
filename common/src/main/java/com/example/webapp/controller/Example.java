package com.example.webapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.webapp.dto.Employee;
import com.example.webapp.util.Constants;


@Controller
public class Example
{
    private List<Employee> employees = Arrays.asList(
                                        new Employee(1, "John", "Doe"),
                                        new Employee(2, "Richard", "Roe"),
                                        new Employee(3, "Jack", "Smith")
                                        );


    @RequestMapping(value="/example")
    public ModelAndView getExample()
    {
        ModelAndView result = new ModelAndView(Constants.VIEW_EXAMPLE);
        result.addObject(Constants.PARAM_ALL_EMPLOYEES, employees);
        result.addObject(Constants.PARAM_SELECTED_EMPLOYEE, employees.get(1));
        return result;
    }
}
