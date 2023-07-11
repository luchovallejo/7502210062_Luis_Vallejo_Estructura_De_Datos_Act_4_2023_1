/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;
import java.util.TreeSet;
/**
 *
 * @author lucho
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        numbers.add(30);

        System.out.println("el numero mas grande es: " + numbers.last());
        System.out.println("El número más pequeño es: " + numbers.first());
    }
}
