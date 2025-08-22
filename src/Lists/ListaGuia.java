/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lists;

import Persons.Employees.Guide;
import java.util.ArrayList;

/**
 *
 * @author Luisk
 */
public class ListaGuia {
    private static ArrayList<Guide> guides = new ArrayList<>();

    public static void addGuide(Guide g) {
        guides.add(g);
    }

    public static Guide findByName(String name) {
        for (Guide g : guides) {
            if (g.getName().equalsIgnoreCase(name)) return g;
        }
        return null;
    }

    public static ArrayList<Guide> getAll() {
        return guides;
    }
}
