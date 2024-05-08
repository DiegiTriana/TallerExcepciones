/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.print.PrintException;

/**
 *
 * @author L&J
 */
public class PrintExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar PrintException
            throw new PrintException("Error de impresión");
        } catch (PrintException e) {
            System.err.println("Error de impresión: " + e.getMessage());
        }
    }
}
