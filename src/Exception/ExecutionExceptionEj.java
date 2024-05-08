/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.concurrent.ExecutionException;

/**
 *
 * @author L&J
 */
public class ExecutionExceptionEj {
      public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar ExecutionException
            throw new ExecutionException("¡Error de ejecución!", new Throwable());
        } catch (ExecutionException e) {
            System.err.println("Se ha producido un error de ejecución: " + e.getMessage());
        }
    }
}
