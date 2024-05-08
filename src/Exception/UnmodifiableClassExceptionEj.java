/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.lang.instrument.UnmodifiableClassException;

/**
 *
 * @author L&J
 */
public class UnmodifiableClassExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar UnmodifiableClassException
            throw new UnmodifiableClassException("Clase no modificable");
        } catch (UnmodifiableClassException e) {
            System.err.println("Clase no modificable: " + e.getMessage());
        }
    }  
}
