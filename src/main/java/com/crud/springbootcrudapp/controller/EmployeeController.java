package com.crud.springbootcrudapp.controller;

import com.crud.springbootcrudapp.dto.EmployeeDTO;
import com.crud.springbootcrudapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "/")
    public String employee(Model model){
        model.addAttribute("employeeDTO",new EmployeeDTO());
        model.addAttribute("employeeList", employeeService.findAllEmployee());
        return "employee";
    }

    @RequestMapping(path = "/save-employee", method = RequestMethod.POST)
    public String saveTeacher(EmployeeDTO employeeDTO) {
        employeeService.saveEmployee(employeeDTO);
        return "redirect:/";
    }






}
