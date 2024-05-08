/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author L&J
 */
public class InvalidTypeExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar InvalidTypeException
            throw new Exception("Tipo no válido");
        } catch (Exception e) {
            System.err.println("Tipo no válido: " + e.getMessage());
        }
    }  
}
