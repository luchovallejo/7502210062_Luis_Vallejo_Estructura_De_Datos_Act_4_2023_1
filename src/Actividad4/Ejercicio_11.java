/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.LinkedList;

public class Ejercicio_11 {
    public static void main(String[] args) {
        LinkedList<Person> personas = new LinkedList<>();
        personas.add(new Person("John", 18));
        personas.add(new Person("Jane", 17));
        personas.add(new Person("Peter", 16));
        personas.add(new Person("Mary", 15));
        personas.add(new Person("Mike", 14));

        for (Person person : personas) {
            if (person.getAge() >= 18) {
                System.out.println(person.getName() + " jugara futbol");
            } else {
                System.out.println(person.getName() + " jugara beisbol");
            }
        }
    }
}
class Person {
    private String nombre;
    private int edad;
    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getName() {
        return nombre;
    }
    public int getAge() {
        return edad;
    }
}
