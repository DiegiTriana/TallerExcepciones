/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.security.InvalidParameterException;

/**
 *
 * @author L&J
 */
public class InvalidParameterExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar InvalidParameterException
            throw new InvalidParameterException("Parámetro inválido");
        } catch (InvalidParameterException e) {
            System.err.println("Parámetro inválido: " + e.getMessage());
        }
    } 
}
