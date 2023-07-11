/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.HashSet;

/**
 *
 * @author lucho
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>();
        HashSet<String> vegetales = new HashSet<>();

        frutas.add("Apple");
        frutas.add("Banana");
        frutas.add("Orange");

        vegetales.add("Tomato");
        vegetales.add("Potato");
        vegetales.add("Carrot");

        System.out.println("Frutas: " + frutas);
        System.out.println("Vegetales: " + vegetales);
    }
}
