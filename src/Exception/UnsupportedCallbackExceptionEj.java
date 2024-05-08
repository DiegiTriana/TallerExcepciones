/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.security.auth.callback.UnsupportedCallbackException;

/**
 *
 * @author L&J
 */
public class UnsupportedCallbackExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar UnsupportedCallbackException
            throw new UnsupportedCallbackException(null, "Callback no compatible");
        } catch (UnsupportedCallbackException e) {
            System.err.println("Callback no compatible: " + e.getMessage());
        }
    }   
}
