package com.telusk.springweb.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
public class Employees {

    @Id
    private Long id;
    private String employName;
    private   String employPhoneNum;
    private String employSalary;


    public String getEmployName() {
        return employName;
    }

    public void setEmployName(String employName) {
        this.employName = employName;
    }

    public String getEmploySalary() {
        return employSalary;
    }

    public void setEmploySalary(String employSalary) {
        this.employSalary = employSalary;
    }

    public String getEmployPhoneNum() {
        return employPhoneNum;
    }

    public void setEmployPhoneNum(String employPhoneNum) {
        this.employPhoneNum = employPhoneNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", employName='" + employName + '\'' +
                ", employPhoneNum='" + employPhoneNum + '\'' +
                ", employSalary='" + employSalary + '\'' +
                '}';
    }
}
