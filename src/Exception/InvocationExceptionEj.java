/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author L&J
 */
public class InvocationExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar InvocationException
            throw new Exception("Excepción de invocación");
        } catch (Exception e) {
            System.err.println("Excepción de invocación: " + e.getMessage());
        }
    }  
}
