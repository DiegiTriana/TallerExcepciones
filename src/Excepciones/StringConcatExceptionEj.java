/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author L&J
 */
public class StringConcatExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar StringConcatException
            throw new Exception("Excepción de concatenación de cadenas");
        } catch (Exception e) {
            System.err.println("Excepción de concatenación de cadenas: " + e.getMessage());
        }
    }  
}
