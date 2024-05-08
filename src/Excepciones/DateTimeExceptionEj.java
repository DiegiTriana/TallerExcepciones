/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.time.DateTimeException;
import java.time.Month;
import java.time.Year;
/**
 *
 * @author L&J
 */
public class DateTimeExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar DateTimeException
            Year.of(-1);
        } catch (DateTimeException e) {
            System.err.println("Error en el año: " + e.getMessage());
        }
        try {
            // Simulación de alguna operación que pueda lanzar DateTimeException
            Month.of(13);
        } catch (DateTimeException e) {
            System.err.println("Error en el mes: " + e.getMessage());
        }
    }  
}
