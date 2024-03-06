package com.telusk.springweb.service;

import com.telusk.springweb.model.Employees;
import com.telusk.springweb.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.PublicKey;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class EmployeeServiceImpl implements IEmployeePayroll {


    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employees> getAllEmploy() {
        return employeeRepo.findAll();

    }

    public List<Employees> setEmploy(Employees employees) {
        employeeRepo.save(employees);
        return getAllEmploy();
    }


    public List<Employees> getEmployById(Long id) {
        return employeeRepo.findAllById(Collections.singleton(id));
    }

    @Override
    public void deleteById(Long id) {
        employeeRepo.deleteById(id);
    }

    public String changeEmpById(Long id, Employees updatedEmployee) {
        Optional<Employees> existingEmployeeOptional = employeeRepo.findById(id);

        if (existingEmployeeOptional.isPresent()) {
            Employees existingEmployee = existingEmployeeOptional.get();

            existingEmployee.setEmployName(updatedEmployee.getEmployName());
            existingEmployee.setEmployPhoneNum(updatedEmployee.getEmployPhoneNum());

            employeeRepo.save(existingEmployee);
            return "Employee data successfully edited";
        } else {
            return "Employee not found with the give ID";
        }
    }


}