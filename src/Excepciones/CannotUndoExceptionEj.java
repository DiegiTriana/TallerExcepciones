/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.swing.undo.CannotUndoException;

/**
 *
 * @author L&J
 */
public class CannotUndoExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar CannotUndoException
            throw new CannotUndoException();
        } catch (CannotUndoException e) {
            System.err.println("No se puede deshacer la operación: " + e.getMessage());
        }
    }
}
