/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.IllegalFormatCodePointException;

/**
 *
 * @author L&J
 */
public class IllegalFormatCodePointExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IllegalFormatCodePointException
            throw new IllegalFormatCodePointException(65);
        } catch (IllegalFormatCodePointException e) {
            System.err.println("Punto de código de formato ilegal: " + e.getMessage());
        }
    }  
}
