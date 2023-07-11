/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.HashMap;

public class Ejercicio_17 {
    
    public static void main(String[] args) {
        Ejercicio_17 shoppingList = new Ejercicio_17();
        shoppingList.addProduct("leche", 2);
        shoppingList.addProduct("carne", 1);
        shoppingList.addProduct("huevos", 6);
        shoppingList.printShoppingList();
        shoppingList.removeProduct("huevos");
        shoppingList.printShoppingList();
    }
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int quantity) {
        products.put(product, quantity);
    }
    public int getQuantity(String product) {
        return products.getOrDefault(product, 0);
    }
    public void removeProduct(String product) {
        products.remove(product);
    }
    public void printShoppingList() {
        for (String product : products.keySet()) {
            System.out.println(product + ": " + products.get(product));
        }
    }
}


