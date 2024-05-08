/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;


public class ActivationExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar IOException
            throw new Exception("¡Error de activación!");
        } catch (Exception e) {
            System.err.println("Se ha producido un error de activación: " + e.getMessage());
        }
    }
}
