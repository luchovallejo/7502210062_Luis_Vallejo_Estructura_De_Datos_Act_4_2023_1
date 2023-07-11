/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lucho
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        Set<String> placas_Vehiculares = new HashSet<>();

        placas_Vehiculares.add("ABC123");
        placas_Vehiculares.add("DEF456");
        placas_Vehiculares.add("GHI789");

        try {
            placas_Vehiculares.add("ABC123"); 
        } catch (Exception e) {
            System.out.println("Error: Esta placa ya existe");
        }

        System.out.println(placas_Vehiculares);
    }
}
