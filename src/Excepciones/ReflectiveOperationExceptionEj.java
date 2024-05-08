/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author L&J
 */
public class ReflectiveOperationExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar ReflectiveOperationException
            throw new ReflectiveOperationException("Error de operación reflexiva");
        } catch (ReflectiveOperationException e) {
            System.err.println("Error de operación reflexiva: " + e.getMessage());
        }
    }
}
