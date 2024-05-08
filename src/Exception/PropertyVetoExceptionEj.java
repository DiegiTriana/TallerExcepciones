/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.beans.PropertyVetoException;

/**
 *
 * @author L&J
 */
public class PropertyVetoExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar PropertyVetoException
            throw new PropertyVetoException("Error de veto de propiedad", null);
        } catch (PropertyVetoException e) {
            System.err.println("Error de veto de propiedad: " + e.getMessage());
        }
    }  
}
