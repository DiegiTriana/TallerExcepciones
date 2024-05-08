/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.IllegalFormatWidthException;

/**
 *
 * @author L&J
 */
public class IllegalFormatWidthExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IllegalFormatWidthException
            throw new IllegalFormatWidthException(10);
        } catch (IllegalFormatWidthException e) {
            System.err.println("Ancho de formato ilegal: " + e.getMessage());
        }
    }  
}
