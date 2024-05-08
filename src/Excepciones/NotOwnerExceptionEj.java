/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author L&J
 */
public class NotOwnerExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar NotOwnerException
            throw new Exception("No es el propietario");
        } catch (Exception e) {
            System.err.println("No es el propietario: " + e.getMessage());
        }
    }  
}
