/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.util.IllegalFormatFlagsException;

/**
 *
 * @author L&J
 */
public class IllegalFormatFlagsExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IllegalFormatFlagsException
            throw new IllegalFormatFlagsException("Bandera de formato ilegal");
        } catch (IllegalFormatFlagsException e) {
            System.err.println("Bandera de formato ilegal: " + e.getMessage());
        }
    }  
}
