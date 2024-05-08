/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.util.IllegalFormatConversionException;

/**
 *
 * @author L&J
 */
public class IllegalFormatConversionExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IllegalFormatConversionException
            throw new IllegalFormatConversionException('d', String.class);
        } catch (IllegalFormatConversionException e) {
            System.err.println("Conversión de formato ilegal: " + e.getMessage());
        }
    }  
}
