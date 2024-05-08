/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author L&J
 */
public class TypeNotPresentExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar TypeNotPresentException
            throw new TypeNotPresentException("Clase no encontrada", null);
        } catch (TypeNotPresentException e) {
            System.err.println("Tipo no presente: " + e.getMessage());
        }
    }

    }