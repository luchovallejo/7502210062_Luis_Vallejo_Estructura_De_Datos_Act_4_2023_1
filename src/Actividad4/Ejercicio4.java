/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.Vector;

/**
 *
 * @author lucho
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        // Create a Vector object.
        Vector<String> nombres = new Vector<>();

        // Add some elements to the vector.
        nombres.add("Luis Vallejo");
        nombres.add("Amalia Stella");
        nombres.add("Mary Rodriguez");

        // Print the elements of the vector.
        for (String names : nombres) {
            System.out.println(names);
        }

        // Remove the element at index 1.
        nombres.remove(1);

        // Print the elements of the vector again.
        for (String name : nombres) {
            System.out.println(name);
        }
    }
}
