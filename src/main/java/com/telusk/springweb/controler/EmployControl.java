package com.telusk.springweb.controler;
import com.telusk.springweb.model.Employees;
import com.telusk.springweb.service.IEmployeePayroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployControl {


    @Autowired
    IEmployeePayroll iEmployeePayroll;

    @GetMapping("/api/allEmploys")
    @ResponseStatus(HttpStatus.OK)
    public List<Employees> getAllEmploy(){
        return iEmployeePayroll.getAllEmploy();
    }
    @PostMapping("/api/setEmploy")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Employees> setemp(@RequestBody Employees employees){
        return  iEmployeePayroll.setEmploy(employees);
    }

    @GetMapping("/api/getById/{id}")
    public List<Employees> getbyid( @PathVariable long id){
        return iEmployeePayroll.getEmployById(id);

    }

    @DeleteMapping("/api/deleteById/{id}")

    public String deleteById(@PathVariable Long id){
        iEmployeePayroll.deleteById(id);
        return "Deleted Successfully" ;
    }

    @PutMapping("/api/editEmpById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String putEmpById(@PathVariable Long id , @RequestBody Employees employees){

        return iEmployeePayroll.changeEmpById(id,employees);
    }




}
