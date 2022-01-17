package com.crud.springbootcrudapp.service;

import com.crud.springbootcrudapp.dto.EmployeeDTO;
import com.crud.springbootcrudapp.entity.Employee;
import com.crud.springbootcrudapp.repo.EmployeeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public void saveEmployee(EmployeeDTO employeeDTO) {
        employeeRepo.save(copyDtoToEntity(employeeDTO));
    }

    public Employee copyDtoToEntity(EmployeeDTO employeeDTO) {

        Employee employee = new Employee();

        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setBuilding(employeeDTO.getBuilding());
        employee.setDivision(employeeDTO.getDivision());
        employee.setRoom(employeeDTO.getRoom());

        return employee;
    }


    public List<EmployeeDTO> findAllEmployee() {

        List<EmployeeDTO> employeeDTOList = new ArrayList<EmployeeDTO>();
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList = employeeRepo.findAll();
        for (Employee employee : employeeList) {
            employeeDTOList.add(copyEntityToDto(employee));
        }
        return employeeDTOList;
    }

    private EmployeeDTO copyEntityToDto(Employee employee) {

        EmployeeDTO employeeDTO=new EmployeeDTO();

        employeeDTO.setEmployeeId(employee.getEmployeeId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setBuilding(employee.getBuilding());
        employeeDTO.setDivision(employee.getDivision());
        employeeDTO.setRoom(employee.getRoom());
        return employeeDTO;
    }


    public  EmployeeDTO findByEmployeeId(Long employeeId){

        EmployeeDTO employeeDTO=new EmployeeDTO();
        Employee employee=new Employee();
        employee=employeeRepo.getById(employeeId);
        BeanUtils.copyProperties(employee, employeeDTO);
        return  employeeDTO;
    }

    public void deleteEmployee(EmployeeDTO employeeDTO) {
        employeeRepo.deleteById(employeeDTO.getEmployeeId());

    }



}
