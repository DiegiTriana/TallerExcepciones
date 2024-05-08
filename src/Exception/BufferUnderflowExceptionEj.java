/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.nio.BufferUnderflowException;

/**
 *
 * @author L&J
 */
public class BufferUnderflowExceptionEj {
     public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar BufferUnderflowException
            throw new BufferUnderflowException();
        } catch (BufferUnderflowException e) {
            System.err.println("Error de subflujo de búfer: " + e.getMessage());
        }
    }
}
