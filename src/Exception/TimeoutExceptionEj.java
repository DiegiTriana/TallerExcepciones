/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.concurrent.TimeoutException;

/**
 *
 * @author L&J
 */
public class TimeoutExceptionEj {
      public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar TimeoutException
            throw new TimeoutException("Tiempo de espera excedido");
        } catch (TimeoutException e) {
            System.err.println("Tiempo de espera excedido: " + e.getMessage());
        }
    }
}
