/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;
import java.util.*;
import java.util.Map;
/**
 *
 * @author lucho
 */
public class Ejercicio_20 {
    public static void main(String[] args) {
        // Crear objetos
        Persona persona1 = new Persona("John", 25);
        Persona persona2 = new Persona("Jane", 30);
        Persona persona3 = new Persona("Mike", 35);
        Persona persona4 = new Persona("Emily", 28);
        Persona persona5 = new Persona("Alex", 32);

        // List
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);

        // Set
        Set<Persona> conjuntoPersonas = new HashSet<>();
        conjuntoPersonas.add(persona1);
        conjuntoPersonas.add(persona2);
        conjuntoPersonas.add(persona3);
        conjuntoPersonas.add(persona4);
        conjuntoPersonas.add(persona5);

        // Map
        Map<String, Persona> mapaPersonas = new HashMap<>();
        mapaPersonas.put("John", persona1);
        mapaPersonas.put("Jane", persona2);
        mapaPersonas.put("Mike", persona3);
        mapaPersonas.put("Emily", persona4);
        mapaPersonas.put("Alex", persona5);

        // Stack
        Stack<Persona> pilaPersonas = new Stack<>();
        pilaPersonas.push(persona1);
        pilaPersonas.push(persona2);
        pilaPersonas.push(persona3);
        pilaPersonas.push(persona4);
        pilaPersonas.push(persona5);

        // Queue
        Queue<Persona> colaPersonas = new LinkedList<>();
        colaPersonas.add(persona1);
        colaPersonas.add(persona2);
        colaPersonas.add(persona3);
        colaPersonas.add(persona4);
        colaPersonas.add(persona5);

        // Operaciones comunes en las colecciones
        // 1. Agregar objetos
        listaPersonas.add(new Persona("Sarah", 27));
        conjuntoPersonas.add(new Persona("David", 31));
        mapaPersonas.put("Linda", new Persona("Linda", 29));
        pilaPersonas.push(new Persona("Michael", 33));
        colaPersonas.add(new Persona("Grace", 26));

        // 2. Buscar objetos
        Persona personaEncontrada = listaPersonas.get(3);
        boolean existePersona = conjuntoPersonas.contains(persona2);
        Persona personaBuscada = mapaPersonas.get("John");
        Persona personaDesapilada = pilaPersonas.peek();
        Persona personaDesencolada = colaPersonas.peek();

        // 3. Insertar objetos
        listaPersonas.add(2, new Persona("Robert", 34));
        // No se puede insertar en un conjunto, ya que no hay índices
        mapaPersonas.put("Emily", new Persona("Emily", 30));
        pilaPersonas.push(new Persona("George", 36));
        colaPersonas.add(new Persona("Olivia", 28));

        // 4. Eliminar objetos
        listaPersonas.remove(persona3);
        conjuntoPersonas.remove(persona5);
        mapaPersonas.remove("Jane");
        pilaPersonas.pop();
        colaPersonas.remove();

        // 5. Saber si un objeto existe
        boolean existePersonaEnLista = listaPersonas.contains(persona4);
        boolean existePersonaEnConjunto = conjuntoPersonas.contains(persona1);
        boolean existePersonaEnMapa = mapaPersonas.containsKey("Linda");
        boolean existePersonaEnPila = pilaPersonas.contains(persona3);
        boolean existePersonaEnCola = colaPersonas.contains(persona2);

        // Recorrer un objeto de tipo List
        System.out.println("Recorriendo lista con for tradicional:");
        for (int i = 0; i < listaPersonas.size(); i++) {
            Persona persona = listaPersonas.get(i);
            System.out.println(persona);
        }

        System.out.println("Recorriendo lista con foreach:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        Iterator<Persona> iterator = listaPersonas.iterator();
        System.out.println("Recorriendo lista con while:");
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            System.out.println(persona);
        }

        System.out.println("Recorriendo lista con do-while:");
        iterator = listaPersonas.iterator();
        do {
            Persona persona = iterator.next();
            System.out.println(persona);
        } while (iterator.hasNext());

        // Ordenar objetos en una lista
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getNombre));
        System.out.println("Lista ordenada:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        // Recorrer un objeto de tipo Set
        System.out.println("Recorriendo conjunto con for tradicional:");
        Persona[] arregloPersonas = conjuntoPersonas.toArray(new Persona[0]);
        for (int i = 0; i < arregloPersonas.length; i++) {
            Persona persona = arregloPersonas[i];
            System.out.println(persona);
        }

        System.out.println("Recorriendo conjunto con foreach:");
        for (Persona persona : conjuntoPersonas) {
            System.out.println(persona);
        }

        iterator = conjuntoPersonas.iterator();
        System.out.println("Recorriendo conjunto con while:");
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            System.out.println(persona);
        }

        System.out.println("Recorriendo conjunto con do-while:");
        iterator = conjuntoPersonas.iterator();
        do {
            Persona persona = iterator.next();
            System.out.println(persona);
        } while (iterator.hasNext());

        // Recorrer un objeto de tipo Map
        System.out.println("Recorriendo mapa con for tradicional:");
        for (Map.Entry<String, Persona> entry : mapaPersonas.entrySet()) {
            String clave = entry.getKey();
            Persona persona = entry.getValue();
            System.out.println("Clave: " + clave + ", Persona: " + persona);
        }

        System.out.println("Recorriendo mapa con foreach:");
        for (String clave : mapaPersonas.keySet()) {
            Persona persona = mapaPersonas.get(clave);
            System.out.println("Clave: " + clave + ", Persona: " + persona);
        }

        

        // Recorrer un objeto de tipo List usando stream
        System.out.println("Recorriendo lista con stream:");
        listaPersonas.stream().forEach(System.out::println);

        // Recorrer un objeto de tipo Set usando stream
        System.out.println("Recorriendo conjunto con stream:");
        conjuntoPersonas.stream().forEach(System.out::println);

        // Recorrer un objeto de tipo Map usando stream
        System.out.println("Recorriendo mapa con stream:");
        mapaPersonas.entrySet().stream().forEach(entry ->
                System.out.println("Clave: " + entry.getKey() + ", Persona: " + entry.getValue()));

        // Recorrer un objeto de tipo List usando una función flecha o función lambda
        System.out.println("Recorriendo lista con función flecha o lambda:");
        listaPersonas.forEach(persona -> System.out.println(persona));

        // Recorrer un objeto de tipo Set usando una función flecha o función lambda
        System.out.println("Recorriendo conjunto con función flecha o lambda:");
        conjuntoPersonas.forEach(persona -> System.out.println(persona));

        // Recorrer un objeto de tipo Map usando una función flecha o función lambda
        System.out.println("Recorriendo mapa con función flecha o lambda:");
        mapaPersonas.forEach((clave, persona) ->
                System.out.println("Clave: " + clave + ", Persona: " + persona));

        // Convertir un array en un objeto List
        String[] arregloNombres = {"Ana", "Juan", "María"};
        List<String> listaNombres = Arrays.asList(arregloNombres);

        // Convertir un objeto List a un array
        String[] nombres = listaNombres.toArray(new String[0]);

        // Dos formas de unir dos listas en una sola
        List<String> lista1 = Arrays.asList("A", "B", "C");
        List<String> lista2 = Arrays.asList("D", "E", "F");

        // Forma 1: Crear una nueva lista y agregar los elementos de ambas listas
        List<String> listaUnida1 = new ArrayList<>(lista1);
        listaUnida1.addAll(lista2);

        // Forma 2: Utilizar el método addAll() para agregar los elementos de la segunda lista a la primera lista
        List<String> listaUnida2 = new ArrayList<>(lista1);
        listaUnida2.addAll(lista2);

        // Desordenar una Lista
        Collections.shuffle(listaPersonas);
        System.out.println("Lista desordenada:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}


