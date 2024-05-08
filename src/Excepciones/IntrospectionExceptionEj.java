/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.beans.IntrospectionException;

/**
 *
 * @author L&J
 */
public class IntrospectionExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IntrospectionException
            throw new IntrospectionException("Error en la introspección");
        } catch (IntrospectionException e) {
            System.err.println("Se ha producido un error en la introspección: " + e.getMessage());
        }
    }
}
