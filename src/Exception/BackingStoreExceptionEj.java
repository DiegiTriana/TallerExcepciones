/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;


public class BackingStoreExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar BackingStoreException
            throw new Exception("¡Error de almacenamiento de respaldo!");
        } catch (Exception e) {
            System.err.println("Se ha producido un error de almacenamiento de respaldo: " + e.getMessage());
        }
    }
}
