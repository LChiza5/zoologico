/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lists;

import Persons.Employees.Employee;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Luisk
 */
public class ListaEmpleado {
    private HashMap<String, Employee> empleados;

    public ListaEmpleado() {
        empleados = new HashMap<>();
    }

    public boolean add(Employee e) {
        if (empleados.containsKey(e.getId())) return false;
        empleados.put(e.getId(), e);
        return true;
    }

    public boolean remove(Employee e) {
        return empleados.remove(e.getId()) != null;
    }

    public Employee findById(String id) {
        return empleados.get(id);
    }

    public Employee findByName(String name) {
        for (Employee e : empleados.values()) {
            if (e.getName().equalsIgnoreCase(name)) return e;
        }
        return null;
    }

    public Collection<Employee> getAll() {
        return empleados.values();
    }
}
