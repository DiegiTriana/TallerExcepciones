/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author L&J
 */
public class RuntimeExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar RuntimeException
            throw new RuntimeException("Error de tiempo de ejecución");
        } catch (RuntimeException e) {
            System.err.println("Error de tiempo de ejecución: " + e.getMessage());
        }
    } 
}
