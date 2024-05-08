/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.awt.color.CMMException;

/**
 *
 * @author L&J
 */
public class CMMExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar CMMException
            throw new CMMException("Error en el perfil de gestión de color");
        } catch (CMMException e) {
            System.err.println("Error en el perfil de gestión de color: " + e.getMessage());
        }
    }
}
