/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.TreeMap;

/**
 *
 * @author lucho
 */
public class Ejercicio_18 {
    public static void main(String[] args) {
        TreeMap<String, String> horariosActividades = new TreeMap<>();

        horariosActividades.put("09:00 AM", "Registro de participantes");
        horariosActividades.put("10:00 AM", "Bienvenida y presentación");
        horariosActividades.put("11:30 AM", "Conferencia principal");
        horariosActividades.put("01:00 PM", "Almuerzo");

        String siguienteActividad = horariosActividades.ceilingKey("10:30 AM");
        String proximaActividad = horariosActividades.get(siguienteActividad);
        System.out.println("Próxima actividad: " + proximaActividad + " a las " + siguienteActividad);

        System.out.println("Horarios de las actividades:");
        for (String horario : horariosActividades.keySet()) {
            String actividad = horariosActividades.get(horario);
            System.out.println(horario + ": " + actividad);
        }
    } 
}
