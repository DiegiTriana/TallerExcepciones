/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;


public class BadAttributeValueExpExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar BadAttributeValueExpException
            throw new Exception("¡Error de valor de atributo no válido!");
        } catch (Exception e) {
            System.err.println("Se ha producido un error de valor de atributo no válido: " + e.getMessage());
        }
    }
}