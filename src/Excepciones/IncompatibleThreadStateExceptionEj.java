/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import com.sun.jdi.IncompatibleThreadStateException;

public class IncompatibleThreadStateExceptionEj {
  public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar IncompatibleThreadStateException
            throw new IncompatibleThreadStateException("¡Estado de hilo incompatible!");
        } catch (IncompatibleThreadStateException e) {
            System.err.println("Se ha producido un error de estado de hilo incompatible: " + e.getMessage());
        }
    }  
}
