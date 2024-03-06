package com.telusk.springweb.repository;

import com.telusk.springweb.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepo extends JpaRepository<Employees,Long> {

}
