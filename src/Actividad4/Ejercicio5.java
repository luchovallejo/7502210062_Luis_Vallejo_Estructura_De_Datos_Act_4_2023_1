/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author lucho
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Vector<String> colores = new Vector<>();
        colores.add("Amarillo");
        colores.add("Azul");
        colores.add("Rojo");

        Enumeration<String> enumeration = colores.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
