package com.crud.springbootcrudapp.service;

import com.crud.springbootcrudapp.dto.EmployeeDTO;
import com.crud.springbootcrudapp.entity.Employee;
import com.crud.springbootcrudapp.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    public void saveEmployee(EmployeeDTO employeeDTO) {
        employeeRepo.save(copyDtoToEntity(employeeDTO));
    }

    public Employee copyDtoToEntity(EmployeeDTO employeeDTO) {
        Employee employee=new Employee();
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setBuilding(employeeDTO.getBuilding());
        employee.setDivision(employeeDTO.getDivision());
        employee.setRoom(employeeDTO.getRoom());

        return employee;
    }




}
