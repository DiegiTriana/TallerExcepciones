/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.io.IOException;

/**
 *
 * @author L&J
 */
public class IOExceptionEj {

    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar IOException
            throw new IOException("Error de E/S");
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
    
}
