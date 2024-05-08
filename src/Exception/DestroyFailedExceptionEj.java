/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanRegistrationException;
import javax.management.NotCompliantMBeanException;

public class DestroyFailedExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar DestroyFailedException
            throw new Exception("¡Error de destrucción fallida!");
        } catch (Exception e) {
            System.err.println("Se ha producido un error de destrucción fallida: " + e.getMessage());
        }
    }  
}
