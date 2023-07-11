/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author lucho
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Buenas");
        strings.add("Noches");

        Collections.sort(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
