/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.naming.NamingException;

/**
 *
 * @author L&J
 */
public class NamingExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar NamingException
            throw new NamingException("Error de nombrado");
        } catch (NamingException e) {
            System.err.println("Error de nombrado: " + e.getMessage());
        }
    } 
}
