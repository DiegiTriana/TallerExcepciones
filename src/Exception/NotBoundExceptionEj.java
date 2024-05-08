/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.rmi.NotBoundException;

public class NotBoundExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de alguna operación que pueda lanzar NotBoundException
            throw new NotBoundException("No está enlazado");
        } catch (NotBoundException e) {
            System.err.println("No está enlazado: " + e.getMessage());
        }
    } 
}
