/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.security.AccessControlException;

/**
 *
 * @author L&J
 */
public class AccessControlExceptionEj {
     public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar AccessControlException
            throw new AccessControlException("Acceso no permitido");
        } catch (AccessControlException e) {
            System.err.println("Acceso no permitido: " + e.getMessage());
        }
    }
}
