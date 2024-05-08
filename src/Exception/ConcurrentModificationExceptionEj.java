/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.ConcurrentModificationException;

/**
 *
 * @author L&J
 */
public class ConcurrentModificationExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar ConcurrentModificationException
            throw new ConcurrentModificationException("Modificación concurrente no permitida");
        } catch (ConcurrentModificationException e) {
            System.err.println("Modificación concurrente no permitida: " + e.getMessage());
        }
    }  
}
