/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author L&J
 */
public class BadLocationExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar la excepción respectiva
            throw new Exception("¡Error de BadLocation!");
        } catch (Exception e) {
            System.err.println("Se ha producido un error de BadLocation: " + e.getMessage());
        }
    }
}