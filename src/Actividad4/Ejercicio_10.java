/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.ArrayList;

/**
 *
 * @author lucho
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        ArrayList<Car> carros = new ArrayList<>();
        carros.add(new Car("Audi", 50000));
        carros.add(new Car("BMW", 40000));
        carros.add(new Car("Mercedes-Benz", 60000));
        carros.add(new Car("Tesla", 70000));
        int maxPrice = 0;
        String mostExpensiveBrand = "";
        for (Car car : carros) {
            if (car.getPrice() > maxPrice) {
                maxPrice = car.getPrice();
                mostExpensiveBrand = car.getBrand();
            }
        }
        System.out.println("La marca de coches más cara es: " + mostExpensiveBrand);
    }
}
class Car {
    private String marca;
    private int price;

    public Car(String marca, int price) {
        this.marca = marca;
        this.price = price;
    }
    public String getBrand() {
        return marca;
    }
    public int getPrice() {
        return price;
    }
}
