/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.nio.charset.CharacterCodingException;

/**
 *
 * @author L&J
 */
public class CharacterCodingExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar CharacterCodingException
            throw new CharacterCodingException();
        } catch (CharacterCodingException e) {
            System.err.println("Error de codificación de caracteres: " + e.getMessage());
        }
    } 
}
