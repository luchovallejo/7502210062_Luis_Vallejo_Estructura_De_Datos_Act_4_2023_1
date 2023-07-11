/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author lucho
 */
public class Ejercicio3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        properties.setProperty("nombre de usuario", "luis");
        properties.setProperty("contraseña", "123456");
        properties.store(new FileOutputStream("my-properties.properties"), "My properties file");
        properties.load(new FileInputStream("my-properties.properties"));
        System.out.println(properties.getProperty("nombre de usuario"));
        System.out.println(properties.getProperty("contraseña"));
    }
}


