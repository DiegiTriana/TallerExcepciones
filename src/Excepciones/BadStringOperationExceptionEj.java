/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author L&J
 */
public class BadStringOperationExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar la excepción respectiva
            throw new Exception("¡Error de BadStringOperation!");
        } catch (Exception e) {
            System.err.println("Se ha producido un error de BadStringOperation: " + e.getMessage());
        }
    }
}