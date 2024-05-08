/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.prefs.InvalidPreferencesFormatException;

/**
 *
 * @author L&J
 */
public class InvalidPreferencesFormatExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar InvalidPreferencesFormatException
            throw new InvalidPreferencesFormatException("Formato de preferencias no válido");
        } catch (InvalidPreferencesFormatException e) {
            System.err.println("Formato de preferencias no válido: " + e.getMessage());
        }
    }   
}
