/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.time.DateTimeException;
import java.time.LocalDate;

public class DateTimeException1 {
    public static void main(String[] args) {
        try {
            // Intentar crear una fecha inválida
            LocalDate date = LocalDate.of(2024, 2, 30); // El 30 de febrero es una fecha inválida
            System.out.println("Fecha: " + date);
        } catch (DateTimeException e) {
            // Manejar la excepción si se produce al crear la fecha
            System.out.println("Error al crear la fecha: " + e.getMessage());
        }
    }
}
