/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Persons.Person;
import Utils.UtilDate;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author jprod
 */
public class Employee extends Person {
    private Double salary;

    public Employee(String id, String name, LocalDate birthDate, String phone, Double salary1) {
        super(id, name, UtilDate.isLegalAge(birthDate) ? birthDate : null, phone);
        
        if (validateSalary(salary)) {
            this.salary = salary;
        } else {
            this.salary = 3000.0; 
        }
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (validateSalary(salary)) {
            this.salary = salary;
        }
    }

    private static boolean validateSalary(double salary) {
        return salary >= 3000;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", phone=" + phone + ", salary=" + salary;
    }

    void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setBirthDate(LocalDate date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setPosition(String puesto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getPuesto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
