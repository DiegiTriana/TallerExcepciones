/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.awt.datatransfer.UnsupportedFlavorException;

/**
 *
 * @author L&J
 */
public class UnsupportedFlavorExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar UnsupportedFlavorException
            throw new UnsupportedFlavorException(null);
        } catch (UnsupportedFlavorException e) {
            System.err.println("Formato no compatible: " + e.getMessage());
        }
    }   
}
