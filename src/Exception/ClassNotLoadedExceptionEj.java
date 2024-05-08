/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import com.sun.jdi.ClassNotLoadedException;

public class ClassNotLoadedExceptionEj {
 public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar la excepción respectiva
            throw new ClassNotLoadedException("¡Error de clase no cargada!");
        } catch (ClassNotLoadedException e) {
            System.err.println("Se ha producido un error de clase no cargada: " + e.getMessage());
        }
    }
}

