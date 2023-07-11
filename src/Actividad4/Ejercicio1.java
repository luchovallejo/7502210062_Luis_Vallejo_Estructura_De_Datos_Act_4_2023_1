/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.Dictionary;
import java.util.Hashtable;


/**
 *
 * @author lucho
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Dictionary<String, String> lenguajes = new Hashtable<>();

        lenguajes.put("nombre", "Juan");
        lenguajes.put("edad", "25");
        lenguajes.put("ciudad", "Colombia");

        String nombre = lenguajes.get("nombre");
        System.out.println("Nombre: " + nombre);

        if (lenguajes.get("edad") != null) {
            String edad = lenguajes.get("edad");
            System.out.println("Edad: " + edad);
        }

        lenguajes.remove("ciudad");

        boolean isEmpty = lenguajes.isEmpty();
        System.out.println("¿El diccionario está vacío? " + isEmpty);

        int size = lenguajes.size();
        System.out.println("Tamaño del diccionario: " + size);
    }
}
