/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucho
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("1");
        lista.add("2");
        lista.add("3");

        String element = lista.get(1);

        System.out.println(element);

        lista.remove(0);

        for (String str : lista) {
            System.out.println(str);
        }
    }
}
