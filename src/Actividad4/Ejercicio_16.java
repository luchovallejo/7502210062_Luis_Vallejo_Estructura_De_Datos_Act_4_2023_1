/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.HashMap;
import java.util.Map;


public class Ejercicio_16 {
    public static void main(String[] args) {
        Map<String, Integer> edad = new HashMap<>();
        edad.put("John", 30);
        edad.put("Jaime", 25);
        edad.put("Luis", 40);

        edad.forEach((key, value) -> {
            System.out.println("La edad de " + key + " es " + value);
        });
    }    
}




