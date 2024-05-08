/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author L&J
 */
public class LineUnavailableExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar LineUnavailableException
            throw new LineUnavailableException("Línea no disponible");
        } catch (LineUnavailableException e) {
            System.err.println("Línea no disponible: " + e.getMessage());
        }
    }   
}
