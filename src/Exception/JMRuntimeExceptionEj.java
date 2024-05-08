/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.management.JMRuntimeException;

/**
 *
 * @author L&J
 */
public class JMRuntimeExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar JMRuntimeException
            throw new JMRuntimeException("Error en la gestión de JMX");
        } catch (JMRuntimeException e) {
            System.err.println("Error de JMX: " + e.getMessage());
        }
    }  
}
