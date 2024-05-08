/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.util.TooManyListenersException;

/**
 *
 * @author L&J
 */
public class TooManyListenersExceptionEj {
    public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar TooManyListenersException
            throw new TooManyListenersException("Demasiados oyentes");
        } catch (TooManyListenersException e) {
            System.err.println("Demasiados oyentes: " + e.getMessage());
        }
    } 
}
