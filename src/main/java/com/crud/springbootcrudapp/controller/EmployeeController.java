package com.crud.springbootcrudapp.controller;

import com.crud.springbootcrudapp.dto.EmployeeDTO;
import com.crud.springbootcrudapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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


    @RequestMapping(path = "/update-employee/{employeeId}", method = RequestMethod.GET)
    public String updateEmployee(Model model, @PathVariable(value = "employeeId") Long employeeId) {
        model.addAttribute("employeeDTO", employeeService.findByEmployeeId(employeeId));
        model.addAttribute("employeeList", employeeService.findAllEmployee());
        return "employee";
    }

    @RequestMapping(path = "/delete-employee/{employeeId}", method = RequestMethod.GET)
    public String delateTeacher(Model model, @PathVariable(value = "employeeId") Long employeeId) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeId(employeeId);
        employeeService.deleteEmployee(employeeDTO);
        return "redirect:/";

    }


}
