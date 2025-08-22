/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tours;

import Persons.Employees.Guide;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Luisk
 */
public class TourHashMap {
    private HashMap<String, Tour> tours;

    public TourHashMap() {
        tours = new HashMap<>();
    }

    private String generateKey(Tour t) {
        return t.getGuide().getName() + "_" + t.getDate().toString();
    }

    public boolean add(Tour t) {
        String key = generateKey(t);
        if (tours.containsKey(key)) {
            return false; 
        }
        tours.put(key, t);
        return true;
    }

    public boolean remove(Tour t) {
        String key = generateKey(t);
        return tours.remove(key) != null;
    }

    public Tour find(Guide guide, java.time.LocalDate date) {
        String key = guide.getName() + "_" + date.toString();
        return tours.get(key);
    }

    public void showAll() {
        for (Tour t : tours.values()) {
            System.out.println(t);
        }
    }

    public Collection<Tour> getAll() {
        return tours.values();
    }
}
