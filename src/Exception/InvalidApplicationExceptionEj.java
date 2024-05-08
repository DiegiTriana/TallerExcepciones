/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author L&J
 */
public class InvalidApplicationExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar InvalidApplicationException
            throw new Exception("Excepción de aplicación no válida");
        } catch (Exception e) {
            System.err.println("Excepción de aplicación no válida: " + e.getMessage());
        }
    } 
}
