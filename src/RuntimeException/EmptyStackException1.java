/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.util.EmptyStackException; // Importamos la clase EmptyStackException del paquete java.util

public class EmptyStackException1 {
    public static void main(String[] args) {
        try {
            // Simulamos un escenario donde se lanza la excepción EmptyStackException
            throw new EmptyStackException();
        } catch (EmptyStackException e) {
            // Manejamos la excepción
            System.out.println("Error: La pila está vacía.");
        }
    }
}
