/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

public class DuplicateRequestException1 {
    public static void main(String[] args) {
        try {
            // Simulamos un escenario donde se lanza la excepción DuplicateRequestException
            throw new DuplicateRequestException("Error: La solicitud está duplicada");
        } catch (DuplicateRequestException e) {
            // Manejamos la excepción
            System.out.println("Error: " + e.getMessage());
        }
    }
}
