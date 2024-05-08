/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.awt.geom.IllegalPathStateException;

/**
 *
 * @author L&J
 */
public class IllegalPathStateExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IllegalPathStateException
            throw new IllegalPathStateException("Estado de ruta ilegal");
        } catch (IllegalPathStateException e) {
            System.err.println("Estado de ruta ilegal: " + e.getMessage());
        }
    }   
}
