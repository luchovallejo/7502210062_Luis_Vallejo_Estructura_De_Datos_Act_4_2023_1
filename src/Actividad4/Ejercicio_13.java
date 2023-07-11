/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author lucho
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        SortedSet<String> frutas = new TreeSet<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");
        frutas.add("Melon");

        System.out.println("Frutas ordenadas de forma alfabetica: " + frutas);

        SortedSet<String> fruitsByColor = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        fruitsByColor.add("Manzana");
        fruitsByColor.add("Banana");
        fruitsByColor.add("Naranja");
        fruitsByColor.add("Pera");
        fruitsByColor.add("Melon");

        System.out.println("Las frutas por color: " + fruitsByColor);
    }
}
