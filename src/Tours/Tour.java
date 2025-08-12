/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tours;

import Animals.Animal;
import Animals.AnimalsHashMap;
import Persons.Employees.Guide;
import Persons.Visitors.Visitor;
import Persons.Visitors.VisitorHashMap;
import java.time.LocalDate;

/**
 *
 * @author jprod
 */
public class Tour {
    private Guide guide;
    private LocalDate date;
    private VisitorHashMap visitors;
    private AnimalsHashMap animals;

    public Tour(Guide guide) {
        this.guide = guide;
        this.date = LocalDate.now();
        this.visitors = new VisitorHashMap();
        this.animals = new AnimalsHashMap();
    }

    public Guide getGuide() {
        return guide;
    }

    public LocalDate getDate() {
        return date;
    }

    public VisitorHashMap getVisitors() {
        return visitors;
    }

    public AnimalsHashMap getAnimals() {
        return animals;
    }

    public boolean addVisitor(Visitor visitor) {
        return visitors.add(visitor);
    }

    public boolean addSeenAnimal(Animal animal) {
        return animals.add(animal);
    }
}
