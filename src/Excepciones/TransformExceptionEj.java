/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author L&J
 */
public class TransformExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar TransformException
            throw new Exception("Excepción de transformación");
        } catch (Exception e) {
            System.err.println("Excepción de transformación: " + e.getMessage());
        }
    }  
}
