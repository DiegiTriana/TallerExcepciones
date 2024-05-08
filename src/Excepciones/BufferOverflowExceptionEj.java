/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.nio.BufferOverflowException;


public class BufferOverflowExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar BufferOverflowException
            throw new BufferOverflowException();
        } catch (BufferOverflowException e) {
            System.err.println("Error de desbordamiento de búfer: " + e.getMessage());
        }
    } 
}
