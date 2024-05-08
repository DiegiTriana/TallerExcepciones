/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.nio.channels.IllegalSelectorException;

/**
 *
 * @author L&J
 */
public class IllegalSelectorExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IllegalSelectorException
            throw new IllegalSelectorException();
        } catch (IllegalSelectorException e) {
            System.err.println("Selector ilegal: " + e.getMessage());
        }
    }
}
