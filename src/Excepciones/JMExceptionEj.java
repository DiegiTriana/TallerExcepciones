/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.management.JMException;

/**
 *
 * @author L&J
 */
public class JMExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar JMException
            throw new JMException("Error de JMX");
        } catch (JMException e) {
            System.err.println("Error de JMX: " + e.getMessage());
        }
    }   
}
