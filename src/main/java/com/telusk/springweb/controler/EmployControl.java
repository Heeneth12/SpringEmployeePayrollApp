package com.telusk.springweb.controler;
import com.telusk.springweb.model.Employees;
import com.telusk.springweb.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployControl {


    @Autowired
    EmployeeRepo employeeRepo;

    @RequestMapping(value = "api/getEmploy",method = RequestMethod.POST)
    //Response entity
    public ResponseEntity<Employees> getEmployee(@RequestBody Employees employees){
        return new ResponseEntity<>(employeeRepo.save(employees), HttpStatus.OK);

    }

}
