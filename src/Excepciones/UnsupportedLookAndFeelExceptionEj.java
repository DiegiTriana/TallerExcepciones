/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author L&J
 */
public class UnsupportedLookAndFeelExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar UnsupportedLookAndFeelException
            throw new UnsupportedLookAndFeelException("LookAndFeel no compatible");
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println("LookAndFeel no compatible: " + e.getMessage());
        }
    } 
}
