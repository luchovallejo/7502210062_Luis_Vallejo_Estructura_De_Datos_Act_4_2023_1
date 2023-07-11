/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.Arrays;

/**
 *
 * @author lucho
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {10, 5, 2, 7, 3, 1, 8, 9, 4, 6};

        Arrays.sort(numeros);

        for (int number : numeros) {
            System.out.println(number);
        }

        int index = Arrays.binarySearch(numeros, 5);

        System.out.println("El índice de 5 es: " + index);
    }
}
