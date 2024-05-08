/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author L&J
 */
public class IllegalArgumentExceptionEj {
    public static void main(String[] args) {
        try {
            int value = -10;
            if (value < 0) {
                throw new IllegalArgumentException("El valor no puede ser negativo."); // Intenta lanzar una excepción con un argumento no válido
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Argumento ilegal.");
        }
    } 
}
