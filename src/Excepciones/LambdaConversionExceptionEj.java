/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.lang.invoke.LambdaConversionException;

/**
 *
 * @author L&J
 */
public class LambdaConversionExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar LambdaConversionException
            throw new LambdaConversionException("Error de conversión de lambda");
        } catch (LambdaConversionException e) {
            System.err.println("Error de conversión de lambda: " + e.getMessage());
        }
    } 
}
