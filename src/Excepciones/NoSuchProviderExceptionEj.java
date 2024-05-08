/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.security.NoSuchProviderException;

/**
 *
 * @author L&J
 */
public class NoSuchProviderExceptionEj {
     public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar NoSuchProviderException
            throw new NoSuchProviderException("El proveedor de correo no está disponible");
        } catch (NoSuchProviderException e) {
            System.err.println("Proveedor de correo no encontrado: " + e.getMessage());
        }
    }
}
