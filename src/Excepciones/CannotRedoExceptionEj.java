/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.swing.undo.CannotRedoException;

/**
 *
 * @author L&J
 */
public class CannotRedoExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar CannotRedoException
            throw new CannotRedoException();
        } catch (CannotRedoException e) {
            System.err.println("No se puede rehacer la operación: " + e.getMessage());
        }
    }   
}
