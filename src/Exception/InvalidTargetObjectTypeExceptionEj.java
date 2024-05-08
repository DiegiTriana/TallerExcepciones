/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author L&J
 */
public class InvalidTargetObjectTypeExceptionEj {
     public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar InvalidTargetObjectTypeException
            throw new Exception("Tipo de objeto de destino no válido");
        } catch (Exception e) {
            System.err.println("Tipo de objeto de destino no válido: " + e.getMessage());
        }
    }
}