/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.xml.crypto.KeySelectorException;

/**
 *
 * @author L&J
 */
public class KeySelectorExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar KeySelectorException
            throw new KeySelectorException("Error del selector de clave");
        } catch (KeySelectorException e) {
            System.err.println("Error del selector de clave: " + e.getMessage());
        }
    }  
}
