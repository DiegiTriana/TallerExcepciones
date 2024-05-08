/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.IllegalFormatPrecisionException;

/**
 *
 * @author L&J
 */
public class IllegalFormatPrecisionExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IllegalFormatPrecisionException
            throw new IllegalFormatPrecisionException(5);
        } catch (IllegalFormatPrecisionException e) {
            System.err.println("Precisión de formato ilegal: " + e.getMessage());
        }
    }  
}
