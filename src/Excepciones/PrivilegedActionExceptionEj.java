/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.security.PrivilegedActionException;

/**
 *
 * @author L&J
 */
public class PrivilegedActionExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar PrivilegedActionException
            throw new PrivilegedActionException(new Exception("Error de acción privilegiada"));
        } catch (PrivilegedActionException e) {
            System.err.println("Error de acción privilegiada: " + e.getMessage());
        }
    }   
}
