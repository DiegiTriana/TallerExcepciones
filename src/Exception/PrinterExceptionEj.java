/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.awt.print.PrinterException;

/**
 *
 * @author L&J
 */
public class PrinterExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar PrinterException
            throw new PrinterException("Error de impresora");
        } catch (PrinterException e) {
            System.err.println("Error de impresora: " + e.getMessage());
        }
    }  
}
