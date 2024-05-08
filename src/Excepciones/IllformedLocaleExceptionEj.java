/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.util.IllformedLocaleException;

public class IllformedLocaleExceptionEj {
     
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IllformedLocaleException
            throw new IllformedLocaleException("Configuración de localización mal formada");
        } catch (IllformedLocaleException e) {
            System.err.println("Configuración de localización mal formada: " + e.getMessage());
        }
    }
}
