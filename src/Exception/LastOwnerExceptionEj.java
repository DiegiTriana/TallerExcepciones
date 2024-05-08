/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author L&J
 */
public class LastOwnerExceptionEj {
     public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar LastOwnerException
            throw new Exception("Último propietario");
        } catch (Exception e) {
            System.err.println("Último propietario: " + e.getMessage());
        }
    }
}
