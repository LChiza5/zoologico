/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;

import Lists.List;
import java.util.Collection;
import java.util.HashMap;


/**
 *
 * @author ilope
 */
public class VisitorHashMap implements List<Visitor> {
    HashMap<String,Visitor> visitors;

    public VisitorHashMap() {
        visitors = new HashMap<>();
    }

    @Override
    public boolean add(Visitor t) {
        if (visitors.containsKey(t.getId())) {
            return false; 
        }
        visitors.put(t.getId(), t);
        return true;
    }

    @Override
    public boolean remove(Visitor t) {
        return visitors.remove(t.getId()) != null;
    }

    @Override
    public Visitor find(Object id) {
        return visitors.get(id);
    }

    @Override
    public void showAll() {
        for (Visitor v : visitors.values()) {
            System.out.println(v);
        }
    }

    public Collection<Visitor> getAll() {
        return visitors.values();
    }
}