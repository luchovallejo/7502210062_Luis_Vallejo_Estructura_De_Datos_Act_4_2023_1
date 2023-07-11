/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.Hashtable;

/**
 *
 * @author lucho
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Hashtable<String, Integer> tablas = new Hashtable<>();
        tablas.put("A", 1);
        tablas.put("B", 2);
        tablas.put("C", 3);
        int value = tablas.get("B");
        System.out.println("Valor de B: " + value);

        boolean containsKey = tablas.containsKey("C");
        System.out.println("Contiene la clave C: " + containsKey);

        boolean containsValue = tablas.containsValue(5);
        System.out.println("Contiene el valor 5: " + containsValue);

        int size = tablas.size();
        System.out.println("Tamaño de la tabla: " + size);

        tablas.remove("A");

        boolean isEmpty = tablas.isEmpty();
        System.out.println("La tabla está vacía: " + isEmpty);
    }
}
