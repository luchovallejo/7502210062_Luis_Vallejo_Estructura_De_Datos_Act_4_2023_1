/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;
import java.util.function.Consumer;

/**
 *
 * @author lucho
 */
public class Dictionary {
    public static void main(String[] args) {
        // Create a dictionary
        Hashtable<String, String> dictionary = new Hashtable<>();

        // Add some key-value pairs to the dictionary
        dictionary.put("key1", "value1");
        dictionary.put("key2", "value2");
        dictionary.put("key3", "value3");

        // Get the value associated with a key
        String value = (String) dictionary.get("key2");
        System.out.println("The value associated with key2 is: " + value);

        // Remove a key-value pair from the dictionary
        dictionary.remove("key1");

        // Check if the dictionary contains a key
        boolean containsKey = dictionary.containsKey("key3");
        System.out.println("The dictionary contains key3: " + containsKey);

        // Get the size of the dictionary
        int size = dictionary.size();
        System.out.println("The size of the dictionary is: " + size);

        // Get a set view of the keys in the dictionary
        Set<String> keys = dictionary.keySet();
        for (String key : keys) {
            System.out.println("The key: " + key);
        }

        // Get a collection view of the values in the dictionary
        Collection<String> values = dictionary.values();
        values.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println("The value: " + value);
            }
        });
    }
}
