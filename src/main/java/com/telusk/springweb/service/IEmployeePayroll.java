package com.telusk.springweb.service;

import com.telusk.springweb.model.Employees;

import java.util.List;

public interface IEmployeePayroll {

    List<Employees> getAllEmploy();
    List<Employees> setEmploy(Employees employees);
    List<Employees> getEmployById(Long id );
    void deleteById(Long id );
    String changeEmpById(Long id, Employees updatedEmployee);


}
