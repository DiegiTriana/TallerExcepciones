/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.awt.geom.NoninvertibleTransformException;

/**
 *
 * @author L&J
 */
public class NoninvertibleTransformExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar NoninvertibleTransformException
            throw new NoninvertibleTransformException("Error de transformación no invertible");
        } catch (NoninvertibleTransformException e) {
            System.err.println("Error de transformación no invertible: " + e.getMessage());
        }
    }  
}
