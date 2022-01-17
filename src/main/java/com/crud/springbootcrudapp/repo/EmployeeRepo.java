package com.crud.springbootcrudapp.repo;

import com.crud.springbootcrudapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {






}
