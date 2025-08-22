/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Lists.List;
import java.util.ArrayList;

/**
 *
 * @author ilope
 */
public class EmployeeList implements List<Employee> {
private ArrayList<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    @Override
    public boolean add(Employee t) {
        if (t == null) return false;
        return employees.add(t);
    }

    @Override
    public boolean remove(Employee t) {
        return employees.remove(t);
    }

    @Override
    public Employee find(Object id) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) { 
                return e;
            }
        }
        return null;
    }

    @Override
    public void showAll() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}