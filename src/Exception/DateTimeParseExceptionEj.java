/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
/**
 *
 * @author L&J
 */
public class DateTimeParseExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar DateTimeParseException
            LocalDate.parse("2022-13-01");
        } catch (DateTimeParseException e) {
            System.err.println("Error en el análisis de fecha: " + e.getMessage());
        }
    }  
}
